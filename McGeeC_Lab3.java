/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Review User Input, Basic String Manipulation, and Calculation
Date : 9/16/25
 */

import java.util.Scanner;

public class McGeeC_Lab3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //Part A
        /*
        char firstInitial;
        char midInitial;
        char lastInitial;

        System.out.print("Please enter first letter of your first name. ");
        firstInitial = keyboard.nextLine().charAt(0);
        System.out.print("Please enter first letter of your middle name. ");
        midInitial = keyboard.nextLine().charAt(0);
        System.out.print("Please enter first letter of your last name. ");
        lastInitial = keyboard.nextLine().charAt(0);

        System.out.print("Please enter your favorite quote. ");
        String myQuote = keyboard.nextLine();

        System.out.printf("My favorite quote in all uppercase: %s \n this quote contains %d characters in it \n and my initials are %s %s %s", myQuote.toUpperCase(), myQuote.length(), firstInitial,midInitial,lastInitial);
        */
        
        //Part B
        
        double d1;
        double d2;
        double d3;
        double sum;
        double average;

        System.out.print("Please enter a decimal point number for d1.");
        d1 = keyboard.nextDouble();
        System.out.print("Please enter a decimal point number for d2.");
        d2 = keyboard.nextDouble();
        System.out.print("Please enter a decimal point number for d3.");
        d3 = keyboard.nextDouble();

        sum = d1 + d2 + d3;
        average = sum/3;

        System.out.printf("You entered these 3 numbers: %f, %f, and %f. \n Sum of these values is %f. \n Average of these values is %f.", d1,d2,d3,sum,average);
        
        //Part C
        /*
        int dividend;
        int divisor;
        int quotient;
        int remainder;

        System.out.print("Please enter a number to be the dividend. ");
        dividend = keyboard.nextInt();
        System.out.print("Please enter a number to be the divisor. ");
        divisor = keyboard.nextInt();
        quotient = dividend/divisor;
        remainder = dividend%divisor;

        System.out.println("When " + dividend + " is divided by " + divisor + ", the quotient is " + quotient + " and the remainder is " + remainder + ".");
        */
        //Part D
        /*
        double a;
        double b;
        double c;
        double mystery;
        System.out.print("Please enter a number for a. ");
        a = keyboard.nextDouble();
        System.out.print("Please enter a number for b. ");
        b = keyboard.nextDouble();

        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b,2)));

        System.out.println("If a triangle has on side " + a + " and another side " + b + ", the side opposite the right angle will be " + c + ".");

        mystery = (Math.sqrt(2*a + 13)/5) + ((6* Math.pow(b,5) - 9)/12);
        System.out.println("Mystery value is " + mystery);
        */
    }
}
