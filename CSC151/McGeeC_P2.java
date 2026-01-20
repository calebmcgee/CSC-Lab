import java.util.Scanner;
import java.util.Random;
/*
 * Number Guessing Game
 * Caleb McGee
*/


public class McGeeC_P2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Introduce Game to User
        System.out.println("Let’s play a number guessing game!");

        //Choose Random Number
        int highest = 10;
        Random randomNumbers = new Random();
        int answer = randomNumbers.nextInt(highest);
        System.out.println("I've chosen a random number between 0 and " + highest + ".");

        //First Guess - Nested if
        System.out.print("Guess an integer between and including 0 and " + highest + ": ");
        int guess = keyboard.nextInt();
        if (guess == answer){
            System.out.println(guess + " is correct!");
            return;
        } else {
            if(guess > answer){
                System.out.println(guess + " is too high.");
            } else if(guess < answer){
                System.out.println(guess + " is too low.");
            }
        }

        //Second Guess - No Nested if
        System.out.print("Guess again: ");
        guess = keyboard.nextInt();

       if (guess == answer){
            System.out.println(guess + " is correct!");
            return;
        } 
        if(guess > answer){
            System.out.println(guess + " is too high.");
        }
        if(guess < answer){
            System.out.println(guess + " is too low.");
        }
        
        //Third Guess -
        System.out.print("Last guess: ");
        guess = keyboard.nextInt();

        if (guess == answer){
            System.out.println(guess + " is correct!");
            return;
        } else {
            String direction = guess > answer ? "high" : "low";
            System.out.println(guess + " is too " + direction + ". The number was " + answer + ".");
        }

    }
}
