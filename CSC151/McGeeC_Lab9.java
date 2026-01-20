import java.util.Scanner;
import java.util.Random;
/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: While Loops, Do-While, and For-Loop
Date : 11/4/25
 */

public class McGeeC_Lab9 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
         
        //Part A
        System.out.print("Enter a limit between 5 and 10: ");
        int limit = keyboard.nextInt();
        //while for stars
        while(limit < 5 || limit > 10){
            System.out.print("Invalid, limit should be between 5-10, please reenter: ");
            limit = keyboard.nextInt();
        }
        System.out.println("\tYou enter " + limit + " for limit.");
        //Part B
        System.out.println("Part B - For Loop - square, cube, square root - limit from part A");
        System.out.println("Number  Square  Cube  Square Root");
        for (int i = 1; i<limit+1; i++){
            System.out.printf(i + "\t %d \t %d\t %.3f\n",(int) Math.pow(i,2),(int) Math.pow(i,3),Math.sqrt(i));
        }
        
        //Part C
        int stars = random.nextInt(10) + 1;
        System.out.println("Part C - Random Stars");
        System.out.print("Stars " + stars + ": ");
        //print stars
        for (int i = 0;i<stars;i++){
            System.out.print("*");
        }
        System.out.print();
        //Part D
        int guessNumber = random.nextInt(20) + 1;
        int yourGuess = 0;
        int noAttempts = 0;
        //do while loop
        do {
            System.out.print("Guess an integer between 1 and 20: ");
            yourGuess = keyboard.nextInt();
            noAttempts++;
            //check guess
            if(yourGuess == guessNumber){ 
                System.out.println("Correct guess, you used " + noAttempts + " attempts.");
            } else {
                System.out.println("Incorrect Guess, try again.");
                if (yourGuess > guessNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");

                }
            }
            //while makes it keep running
        } while (yourGuess != guessNumber);
        
        //Bonus
        //Prints times
        for (int i=0; i<24;i++){
            for(int j=0;j<60;j++){
                if(i<10){
                    System.out.print("0"+i);
                } else {
                    System.out.print(i);
                }
                if(j<10){
                    System.out.println(":0" + j);
                } else {
                    System.out.println(":" + j);
                }
            }
        }
    }
}
