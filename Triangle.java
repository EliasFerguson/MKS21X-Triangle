public class Triangle {
  private Point v1,v2,v3;
  public static void main(String[]args) {

  }
  public Triangle(Point p1In , Point p2In, Point p3In) {
    v1 = p1In;
    v2 = p2In;
    v3 = p3In;
  }
  public Triangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y) {
    v1 = new Point(p1x, p1y);
    v2 = new Point(p2x, p2y);
    v3 = new Point(p3x, p3y);
  }
  public double getPerimeter() {
    double v1v2 = v1.distanceTo(v2);
    double v2v3 = v2.distanceTo(v3);
    double v1v3 = v1.distanceTo(v3);
    return v1v2 + v2v3 + v1v3;
  }
//  public Point getVertex(int index) {
//
//  }
//  public void setVertex(int index, Point newP)
}
