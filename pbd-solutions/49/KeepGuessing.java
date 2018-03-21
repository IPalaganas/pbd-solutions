import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        int x = 1 + r.nextInt(10);
        
        System.out.print("Guess my number: ");
        int entry = input.nextInt();
        
    while (entry != x) {
        System.out.println("\nINCORRECT!");
        System.out.print(" TRY AGAIN? ");
        entry = input.nextInt();
        }
        
        System.out.println("CORRECT!");
        }
}
