import java.util.*;

public class Hill {
  private double[] hillDetails = new double[3]; // [height, pointsPerMeter, par]

  public Hill(double[] hillDetails){
    if (hillDetails != null)
      this.hillDetails = hillDetails;
  }

  public double getHeight(){
    return hillDetails[0];
  }

  public double getPointsPerMeter(){
    return hillDetails[1];
  }

  public double getPar(){
    return hillDetails[2];
  }

  public static double[] inputHillDetails(){
    double[] hillDetails;

    System.out.println("Enter the hill details. \n(Format: height pointsPerMeter par)");
    String[] hillDetailsInput = input.nextLine().split(" ");
    while (hillDetailsInput.length() != 3){
        System.out.println("An error occured, please try again.");
        hillDetailsInput = input.nextLine().split(" ");
    }
        
    try {
      hillDetails = new double[]{(double) hillDetailsInput[0], (double) hillDetailsInput[1], (double) hillDetailsInput[2]};
    } catch (Exception e) {
      System.out.println("An error occured, hill details not updated.");
    }

    return hillDetails; 
  }
}
