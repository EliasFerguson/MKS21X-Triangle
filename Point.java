//immutable point class:
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point p) {
    double a = (this.x - p.x);
    double b = (this.y - p.y);
    return Math.sqrt((a * a) + (b * b));
  }
  public static double distance(Point p1, Point p2) {
    double a = (p1.x - p2.x);
    double b = (p1.y - p2.y);
    return Math.sqrt((a * a) + (b * b));
  }
//  public String toString() {
    //
  //}
}
