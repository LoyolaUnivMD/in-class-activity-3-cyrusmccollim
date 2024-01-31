public class Hill {
  private String name;
  private double height, pointsPerMeter, par;

  public Hill(String name, double height, double pointsPerMeter, double par){
    this.name = name;
    this.height = height;
    this.pointsPerMeter = pointsPerMeter;
    this.par = par;
  }

  public String getName(){
    return name;
  }

  public double getHeight(){
    return height;
  }

  public double getPointsPerMeter(){
    return pointsPerMeter;
  }

  public double getPar(){
    return par;
  }
}
