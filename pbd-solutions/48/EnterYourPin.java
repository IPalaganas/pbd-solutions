import java.util.Scanner;

public class EnterYourPin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 54321;
        
        System.out.println("WELCOME TO THE BANK OF BMO");
        System.out.print("ENTER YOUR PIN: ");
        int entry = input.nextInt();
        
        while (entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = input.nextInt();
        }
        
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }
}
//each both check if the requirements are met to run the code
//a while loop will keep executing the code when the requirements are meant an if statement only runs it once
//entry already exists
//infinte loop because it doesnt ask for another input
