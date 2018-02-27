import java.util.Scanner;
public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("What is yout weight (kg)?");
    double weight = input.nextDouble();
    System.out.print("What is your height (m)?");
    double height = input.nextDouble();
    System.out.println("Your body mass index is " + (weight / (height * height)));
  }
}
