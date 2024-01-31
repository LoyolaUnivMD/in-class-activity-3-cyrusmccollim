public class Hill {
  private String name;
  private double height, pointsPerMeter, par;

  public Hill(List<Object> hillDetails){
    name = (String) hillDetails.get(0);
    height = (double) hillDetails.get(1);
    pointsPerMeter = (double) hillDetails.get(2);
    par = (double) hillDetails.get(3);
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
