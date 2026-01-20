/*
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Review User Input, Basic String Manipulation, and Calculation
Date : 9/23/25
 */

import java.util.Scanner;
public class McGeeC_Lab4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        /* 
        //Part A
        
        char alpha1, alpha2, alpha3;
        System.out.print("Enter a character representing your favorite alphabet: ");
        alpha1 = keyboard.nextLine().charAt(0);
        System.out.print("Enter a character representing your 2nd favorite alphabet: ");
        alpha2 = keyboard.nextLine().charAt(0);
        System.out.print("Enter a character representing your 3rd favorite alphabet: ");
        alpha3 = keyboard.nextLine().charAt(0);

        String favMovie, favSong, favFood;
        System.out.print("Enter your favorite movie: ");
        favMovie = keyboard.nextLine();
        System.out.print("Enter your favorite food: ");
        favFood = keyboard.nextLine();
        System.out.print("Enter your favorite song: ");
        favSong = keyboard.nextLine();

        int size = favFood.length();
        char lastCharUpper = favSong.toUpperCase().charAt(favSong.length()-1);
        System.out.println("My favorite movie is " + favMovie + "\nMy favorite song is " + favSong + "\n\t The last character of my favorite song in uppercase is " + lastCharUpper + "\nMy favorite food in all uppercase " + favFood.toUpperCase() +"\n\t This food contains " + size + " characters in it. \n\t and my favorites alphabet are " + alpha1 +", " + alpha2 +", "+ alpha3+".");
        
        //Part B
        int num1, num2, num3, num4, num5, total;
        double average;
        System.out.print("Enter a integer for num1: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter a integer for num2: ");
        num2 = keyboard.nextInt();
        System.out.print("Enter a integer for num3: ");
        num3 = keyboard.nextInt();
        System.out.print("Enter a integer for num4: ");
        num4 = keyboard.nextInt();
        System.out.print("Enter a integer for num5: ");
        num5 = keyboard.nextInt();

        total = num1 + num2 + num3 + num4 + num5;
        average = total/5;

        System.out.printf("You entered these 5 numbers: "+ num1 +", "+ num2 +", "+num3+", "+ num4 +", and "+ num5 +". \nThe total of these values is " + total + ".\nThe average of these values is " + average + ".");
        
        */
        /*Part C
        Male and Female Percentages
        Write a program that asks the user for the number of males and the number of females registered in a class. The program should display the percentage of males and females in the class.
        Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class. The percentage of males can be calculated as 8 ÷ 20 = 0.4, or 40%. The percentage of females can be calculated as 12 ÷ 20 = 0.6, or 60%.
        */
        /* 
        int males, females;
        System.out.print("How many males are in your class? ");
        males = keyboard.nextInt();
        System.out.print("How many females are in your class? ");
        females = keyboard.nextInt();

        int classSize = males + females;
        double malePercent = (males/(double)classSize)*100;
        double femalePercent = (females/(double)classSize)*100;

        System.out.printf("Out of the %d people in your class, %.2f% are males and %.2f% are females", classSize, malePercent, femalePercent);
        */
        /* Bonus
         The amount of principal originally deposited into the account
The annual interest rate paid by the account
The number of times per year that the interest is compounded (for example, if interest is compounded monthly, enter 12; if interest is compounded quarterly, enter 4)
The number of years the account will be left to earn interest
        */

        System.out.print("The amount of principal originally deposited into the account: ");
        double p = keyboard.nextDouble();
        System.out.print("The annual interest rate paid by the account: ");
        double r = keyboard.nextDouble()/100;
        System.out.print("The number of times per year that the interest is compounded \n(for example, if interest is compounded monthly, enter 12; if interest is compounded quarterly, enter 4): ");
        int n = keyboard.nextInt();
        System.out.print("The number of years the account will be left to earn interest: ");
        int t= keyboard.nextInt();

        double a = p*(1+Math.pow((r/(double)n),(double)n*(double)t));

        System.out.printf("%f$ will be left after %d years",a,t);
        
        
        
    }
}
