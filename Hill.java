class Hill{
  private String type;
  private int height;
  private int par;
  private double pointsPerMeter;

  public void Hill(){
    type = "normal";
    height = 46;
    pointsPerMeter = 2;
    par = 90;
  }
  
  public void Hill(String type){
    if (type.toLowerCase.equals("large")){
      this.type = "large";
      height = 70;
      pointsPerMeter = 1.8;
      par = 120;
    } else {
      this.type = "normal";
      height = 46;
      pointsPerMeter = 2;
      par = 90;
    }
  }

  public String getType(){
    return type;
  }

  public int getHeight(){
    return height;
  }
  
  public int getPar(){
    return par;
  }

  public double getPointsPerMeter(){
    return pointsPerMeter;
  }

  public double calculatePoints(double jumperSpeed){
    distanceTraveled = jumperSpeed * Math.sqrt((2 * height) / 9.8);
    return 60 + (distanceTraveled - par) * pointsPerMeter;
  }
}
