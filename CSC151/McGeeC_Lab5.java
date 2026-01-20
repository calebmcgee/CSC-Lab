/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Conditioning Statement: if, if-else, and basic nested-if-else
Date : 9/30/25
 */

import java.util.Scanner;

public class McGeeC_Lab5{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //Part A
        final int myDIGIT = 3;
        System.out.print("Guess my favorite digit 0-9: ");
        int guessDIGIT = keyboard.nextInt();

        if (guessDIGIT == myDIGIT){
            System.out.println("Good Guess, " + myDIGIT + " is my favorite digit.");
        } else {
            System.out.println("Sorry, " + myDIGIT + " is the correct answer.");
        }
        
        //Part B 
        System.out.print("Enter a number: ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        int num2 = keyboard.nextInt();
        if (num1 == num2){
            System.out.println("Based on user input " + num1 + " and " + num2 + " num1 is equal to num2.");

        } else if (num1 < num2){
            System.out.println("Based on user input " + num1 + " and " + num2 + " num1 is lower than num2.");
        } else {
            System.out.println("Based on user input " + num1 + " and " + num2 + " num1 is higher than num2.");

        }
        
        //Part C

        System.out.print("Enter a third number between 0-100: ");
        int num3 = keyboard.nextInt();
        System.out.print("Enter a fourth number between 0-100: ");
        int num4 = keyboard.nextInt();
        System.out.print("Enter a fifth number between 0-100: ");
        int num5 = keyboard.nextInt();

        double average = (double)(num1 + num2 + num3 + num4 + num5) / 5.0;
        String letterGrade;
        if (average < 60){
            letterGrade = "F";
        }else if (average < 70){
            letterGrade = "D";
        }else if (average < 80){
            letterGrade = "C";
        }else if (average < 90){
            letterGrade = "B";
        }else{
            letterGrade = "A";
        }

        System.out.println("Your average score is " + average + " and you earn " + letterGrade);
        
        //Part D
        System.out.print("Enter a number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        num2 = keyboard.nextInt();
        System.out.print("Enter a number: ");
        num3 = keyboard.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.print("You entered " + num1 + " " + num2 + " " + num3 + ", and the highest number is " + num1 +".");
        }else if (num2 > num1 && num2 > num3) {
            System.out.print("You entered " + num1 + " " + num2 + " " + num3 + ", and the highest number is " + num2 +".");
            
        }else{
            System.out.print("You entered " + num1 + " " + num2 + " " + num3 + ", and the highest number is " + num3 +".");

        }

        //Part E
        keyboard.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        char firstChar = lastName.toUpperCase().charAt(0);
        
        if (firstChar < 'N'){
            System.out.println(firstChar + " is in the first half of the alphabet.");
        } else {
            System.out.println(firstChar + " is in the second half of the alphabet.");

        }


        
    }

}
