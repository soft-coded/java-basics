import java.util.Scanner;

public class Circle {
  double radius, PI = 3.1415;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double area() {
    return PI * getRadius() * getRadius();
  }

  public double circumference() {
    return 2 * PI * getRadius();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Circle cir = new Circle();

    System.out.println("Enter radius:");
    cir.setRadius(sc.nextDouble());
    sc.close();

    System.out.println("Area of circle with radius " + cir.getRadius() + ":");
    System.out.println(cir.area());
    System.out.println("Circumference of circle with radius " + cir.getRadius() + ":");
    System.out.println(cir.circumference());
  }
}