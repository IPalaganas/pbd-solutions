import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random r = new Random();
       
        System.out.println("Let's roll the dice...");
          
        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);
        
        while (dice1 != dice2) {
        System.out.println("Dice 1 = " + dice1);
        System.out.println("Dice 2 = " + dice2);
        System.out.println("You're total is " + (dice1 + dice2));
        System.out.println("Okay let's roll again!");
        
        dice1 = 1 + r.nextInt(6);
        dice2 = 1 + r.nextInt(6);
        
        }
        
        System.out.println("Dice 1 = " + dice1);
        System.out.println("Dice 2 = " + dice2);
        System.out.println("DOUBLES!!! CONGRATS!!!");
        System.out.println("You're total is " + (dice1 + dice2));
        
   }
}
        
        
        

