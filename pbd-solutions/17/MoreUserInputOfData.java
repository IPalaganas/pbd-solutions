import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your personal information here!");
    System.out.println(" ");
    System.out.print("First name:");
    String firstName = input.next();
    System.out.print("Last name:");
    String lastName = input.next();
    System.out.print("Grade:");
    int grade = input.nextInt();
    System.out.print("Student ID #:");
    int studentId = input.nextInt();
    System.out.print("Username:");
    String username = input.next();
    System.out.print("Average:");
    int average = input.nextInt();
    
    System.out.println(" ");
    System.out.println("---------------------------------------");
    System.out.println(" ");
    
    System.out.println("Your Information:");
    System.out.println("First name: " + firstName);
    System.out.println("Last name: " + lastName);
    System.out.println("Grade: " + grade);
    System.out.println("Student ID: " + studentId);
    System.out.println("Username: " + username);
    System.out.println("Average: " + average);
    }
}
