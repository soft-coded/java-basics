import java.util.Scanner;

public class Circle {
  double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Circle cir = new Circle();
    double area;

    System.out.println("Enter radius:");
    cir.setRadius(sc.nextDouble());

    System.out.println("Area of circle with radius " + cir.getRadius() + ":");
    area = 3.1415 * cir.getRadius() * cir.getRadius();
    System.out.println(area);
    sc.close();
  }
}