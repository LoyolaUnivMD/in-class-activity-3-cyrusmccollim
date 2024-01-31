import java.util.*;

public class SkiJump {
  private HashMap<String, List<Double>> HILL_TYPES = new HashMap<String, List<Double>>();
  private String hillType;

  HILL_TYPES.put("normal", [46.0, 2.0, 90.0]);
  HILL_TYPES.put("large", [70.0, 1.8, 120.0]);

  public SkiJump(){
    hillType = "normal";
  }
  
  public SkiJump(String hillType){
    if (HILL_TYPES.contains(hillType))    this.hillType = hillType;
    else                                  this.hillType = "normal";
  }
  
  public double calculatePoints(double jumperSpeed){
    double height = HILL_TYPES.get(hillType).get(0);
    double pointsPerMeter = HILL_TYPES.get(hillType).get(1);
    double par = HILL_TYPES.get(hillType).get(2);
    
    return 60 + ((jumperSpeed * Math.sqrt((2 * height) / 9.8) - par) * pointsPerMeter);
  }

  public String strResult(){
    String result;
    if (points >= 61)      result = "Great job for doing better than par!";
    else if (points < 10)  result = "What happened?";
    else                   result = "Sorry you didn’t go very far.";
    return result;
  }
}
