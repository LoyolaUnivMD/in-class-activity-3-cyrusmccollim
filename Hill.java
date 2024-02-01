import java.util.*;

public class Hill {
  private final double[] hillDetails; // Format: [height, pointsPerMeter, par]

  public Hill(double[] hillDetails) { this.hillDetails = hillDetails; }

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

    double[] details = new double[]{46.0, 2.0, 90.0}; // The default hill details, called "normal".

    System.out.print("\n[Format: height pointsPerMeter par]\nEnter the hill details: ");
    Scanner input = new Scanner(System.in);
    String[] hillDetailsInput = input.nextLine().split(" ");
        
    try {
      double[] detailsTemp = new double[3];
      for (int i = 0; i < 3; i++){
        detailsTemp[i] = Double.parseDouble(hillDetailsInput[i]);
      }
      details = detailsTemp;
    } catch (Exception e) {
      System.out.println("An error occurred, hill details set to \"normal\".");
    }

    return details;
  }
}
