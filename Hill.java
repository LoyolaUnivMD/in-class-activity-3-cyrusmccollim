public class Hill {
  private String type;
  private int height;
  private int par;
  private double pointsPerMeter;
  private double points;

  public void Hill(){
    type = "normal";
    height = 46;
    pointsPerMeter = 2;
    par = 90;
    points = 0;
  }
  
  public void Hill(String type){
    if (type.toLowerCase.equals("large")){
      this.type = "large";
      height = 70;
      pointsPerMeter = 1.8;
      par = 120;
      points = 0
    } else {
      this.type = "normal";
      height = 46;
      pointsPerMeter = 2;
      par = 90;
      points = 0
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
    distance = jumperSpeed * Math.sqrt((2 * height) / 9.8);
    points = 60 + (distance - par) * pointsPerMeter
    return points;
  }

  public String findResult(){
    String result;
    if (points >= 61)      result = "Great job for doing better than par!";
    else if (points < 10)  result = "What happened?";
    else                   result = "Sorry you didn’t go very far.";
  }
}
