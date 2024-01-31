public class Hill {
  private double[] hillDetails;

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
}
