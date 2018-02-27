 import java.util.Scanner;
 public class DumbCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Insert first number:");
    double firstNumber = input.nextDouble();
    System.out.print("Insert second number:");
    double secondNumber = input.nextDouble();
    System.out.print("Insert third number:");
    double thirdNumber = input.nextDouble();
    System.out.println("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 = " +  ((firstNumber + secondNumber + thirdNumber) / 2 )); 
;  }
}
