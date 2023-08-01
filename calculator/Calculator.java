import java.util.Scanner;

public class Calculator {
  double a, b;

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Scanner sc = new Scanner(System.in);
    double num1, num2, ans;
    boolean repeat = true;
    char operator;

    while (repeat) {
      System.out.println("Input the first number:");
      num1 = sc.nextDouble();
      System.out.println("Input the second number:");
      num2 = sc.nextDouble();
      System.out
          .println("Enter the operator:\n+ for addition\n- for subtraction\n* for multiplication\n/ for division");
      operator = sc.next().charAt(0);

      switch (operator) {
        case '+':
          ans = calc.add(num1, num2);
          break;
        case '-':
          ans = calc.subtract(num1, num2);
          break;
        case '*':
          ans = calc.multiply(num1, num2);
          break;
        case '/':
          ans = calc.divide(num1, num2);
          break;
        default:
          System.out.println("Invalid operator");
          return;
      }

      System.out.println("Answer of the operation:\n" + ans);
      System.out.println("Begin again? y or n");
      char beginAgain = sc.next().charAt(0);
      if (beginAgain == 'n')
        repeat = false;
      else if (beginAgain != 'y') {
        System.out.println("Invalid answer, beginning again");
      }
    }

    System.out.println("Goodbye");
    sc.close();
  }

  /*
   * // getters
   * public double getA() {
   * return a;
   * }
   * 
   * public double getB() {
   * return b;
   * }
   * 
   * // setters
   * public void setA(double a) {
   * this.a = a;
   * }
   * 
   * public void setB(double b) {
   * this.b = b;
   * }
   */
  // operations
  public double add(double a, double b) {
    return a + b;
  }

  public double subtract(double a, double b) {
    return a - b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  public double divide(double a, double b) {
    return a / b;
  }

}