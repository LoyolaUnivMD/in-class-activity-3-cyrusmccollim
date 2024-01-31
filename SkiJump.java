import java.util.*;

public class SkiJump {
  private final Hill hill;
  private final double jumpSpeed;

  public SkiJump(Hill hill, double jumpSpeed){
    this.hill = hill;
    this.jumpSpeed = jumpSpeed;
  }
  
  public double calculatePoints(){
    return 60 + ((jumpSpeed * Math.sqrt((2 * hill.getHeight()) / 9.8) - hill.getPar()) * hill.getPointsPerMeter());
  }

  public String getResult(){
    double points = calculatePoints();
    if (points >= 61)      return "Great job for doing better than par!";
    else if (points < 10)  return "What happened?";
    else                   return "Sorry you didn’t go very far.";
  }
}
