public class WhatIf {
    public static void main(String[] args) {
        int people = 5;
        int cats = 5;
        int dogs = 15;
        // the if statement checks if there are more cats then people, and if there are, then it prints the line
        if (people < cats) {
            System.out.println("Too many cats! The world is doomed!");
            }
        // the curly brackets contain the line of code that will run if the if statement is fulfilled
        if (people > cats) {
            System.out.println("Not many cats! The world is saved!");
            }
        if (people < dogs) {
            System.out.println("The world is drooled on!");
            }
        if (people > dogs) {
            System.out.println("The world is dry!");
            }
            
        dogs += 5;
        
        if (people >= dogs) {
            System.out.println("People are greater than or equal to dogs.");
            }
        if (people <= dogs) {
            System.out.println("People are less than or equal to dogs.");
            }
        if (people == dogs) {
            System.out.println("People are dogs");
            }
        }
 }
            
