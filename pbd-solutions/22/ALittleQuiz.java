import java.util.Scanner;

public class ALittleQuiz { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Are you ready for a quiz?");
    String yesNo = input.next();
    if (yesNo == "yes") {
        System.out.println("Okay lets start!");
    }
    else if (yesNo == "no") {
        System.out.println("No?");
    }
    }
 }    
   
