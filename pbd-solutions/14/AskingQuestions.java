import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("How old are you?");
    int age = input.nextInt();
    
    System.out.println("How tall are you? (feet only)");
    String height1 = input.next();
    
    System.out.println("How tall are you? (inches only)");
    String height2 = input.next();
    
    System.out.println("How much do you weigh?");
    double weight = input.nextDouble();
    
    System.out.println("So you're " + age + " years old, " + height1 + "'" + height2 + " tall, and " + weight + " heavy.");
    }
}
