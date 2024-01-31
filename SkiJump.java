import java.util.*;

public class SkiJump {
  private final HashMap<String, double[]> HILL_TYPES = new HashMap<>();
  private final String hillType;
  private final double jumpSpeed;

  public SkiJump(String hillType, double jumpSpeed){
    initializeHillTypes();
    if (HILL_TYPES.containsKey(hillType))   this.hillType = hillType;
    else                                    this.hillType = "normal";
    this.jumpSpeed = jumpSpeed;
  }

  private void initializeHillTypes() {
    HILL_TYPES.put("normal", new double[]{46.0, 2.0, 90.0});
    HILL_TYPES.put("large", new double[]{70.0, 1.8, 120.0});
  }
  
  public double calculatePoints(){
    double height = HILL_TYPES.get(hillType)[0];
    double pointsPerMeter = HILL_TYPES.get(hillType)[1];
    double par = HILL_TYPES.get(hillType)[2];
    
    return 60 + ((jumpSpeed * Math.sqrt((2 * height) / 9.8) - par) * pointsPerMeter);
  }

  public String getResult(){
    double points = calculatePoints();

    if (points >= 61)      return "Great job for doing better than par!";
    else if (points < 10)  return "What happened?";
    else                   return "Sorry you didn’t go very far.";
  }
}
