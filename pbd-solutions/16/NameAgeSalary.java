import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is your name?");
    String name = input.next();
    
    System.out.print("Okay, " + name + " what is your age?");
    int age = input.nextInt();
    
    System.out.print("You're " + age + " " + name + "? How much do you make?");
    double salary = input.nextDouble();touc
    
    System.out.print("You make " + salary + "$, WOW!");
    }
}
