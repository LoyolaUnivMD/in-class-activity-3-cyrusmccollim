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
    String result = "\nThe results are in. ";

    double points = calculatePoints();
    if (points >= 61)      result += "Great job for doing better than par!";
    else if (points < 10)  result += "What happened?";
    else                   result += "Sorry, you did not go very far.";

    return result;
  }

  public static double inputJumperSpeed(){
    double jumpSpeed = 25.0; // The average.

    try {
      System.out.print("\nEnter the jumper's speed: ");
      Scanner input = new Scanner(System.in);
      jumpSpeed = input.nextDouble();
    } catch (Exception e){
      System.out.println("An error occurred, jump speed set to the average.");
    }

    return jumpSpeed;
  }
}
