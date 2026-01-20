/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Review For Midterm
Date : 10/07/25
 */


import java.util.Scanner;

public class McGeeC_Lab6 {
    public static void main(String []args){

        Scanner keyboard = new Scanner(System.in);
        
        //Part A
        System.out.print("Please enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Please enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Please enter age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter hometown: ");
        String hometown = keyboard.nextLine();
        System.out.print("Please enter gpa: ");
        double gpa = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Please enter major: ");
        String major = keyboard.nextLine();
        System.out.print("Please enter favorite character: ");
        char favChar = keyboard.nextLine().charAt(0);

        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Age is " + age);
        System.out.println("Hometown is " + hometown);
        System.out.println("GPA is " + gpa);
        System.out.println("Major is " + major);
        System.out.println("Favorite character is " + favChar);

        int majorLen = major.length();
        String upperHometown = hometown.toUpperCase();
        String lowerMajor = major.toLowerCase();
        String initials = "" + firstName.charAt(0) + lastName.charAt(0);

        System.out.println("The number of characters in " + major + " is " + majorLen +".");
        System.out.println("The uppercase of your hometown is " + upperHometown +".");
        System.out.println("The lowercase of your major is " +  lowerMajor +".");
        System.out.println("Your initials are " + initials + ".");
        
        //Part B
        System.out.print("Please enter a integer: ");
        int a = keyboard.nextInt();
        System.out.print("Please enter another integer: ");
        int b = keyboard.nextInt();
        System.out.print("Please enter one more integer: ");
        int c = keyboard.nextInt();
        System.out.print("Please enter a double: ");
        double m = keyboard.nextDouble();

        final double rate = 7.45;

        int result1 = (int)(Math.pow(a,6) + 6*rate-Math.sqrt(3*a*b));
        double result2 = ((5*Math.pow(m,3) + 7)/Math.sqrt(8)) + ((25*c%a)/6);

        System.out.println("Your first number was " + a);
        System.out.println("Your second number was " + b);
        System.out.println("Your third number was " + c);
        System.out.println("Your fourth number was " + m);
        System.out.println("The rate was " + rate);
        System.out.println("Result1 was " + result1);
        System.out.println("Result2 was " + result2);

        //Part C
        System.out.print("Please enter a integer: ");
        int num1 = keyboard.nextInt();
        System.out.print("Please enter another integer: ");
        int num2 = keyboard.nextInt();
        System.out.print("Please enter one more integer: ");
        int num3 = keyboard.nextInt();
        keyboard.nextLine();

        if (num1 == num2 && num1 == num3){
            System.out.println("All integers are the same.");
        } else {

            if (num1 > num2 && num1 > num3){
                System.out.println("Num1 is the highest number.");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("Num2 is the highest number.");
            } else if (num3 > num1 && num3 > num2) { 
                System.out.println("Num3 is the highest number.");
            } else if (num1 < num2 && num1 < num3){
                System.out.println("Num1 is the lowest number.");
            } else if (num2 < num1 && num2 < num3){
                System.out.println("Num2 is the lowest number.");
            } else if (num3 < num1 && num3 < num2){
                System.out.println("Num3 is the lowest number.");
         }

            //Part D
            System.out.print("Enter a character: ");
            char myChar = keyboard.nextLine().charAt(0);
            if (myChar == 'A' || myChar == 'a'){
                System.out.println("A for Ant.");
            } else if(myChar == 'B' || myChar == 'b'){
                System.out.println("B for Bear.");
            } else if(myChar == 'C' || myChar == 'c'){
                System.out.println("C for Cat.");
            } else if(myChar == 'D' || myChar == 'd'){
                System.out.println("D for Dog.");
            } else if(myChar == 'E' || myChar == 'e'){
                System.out.println("E for Elephant.");
            } else {
                System.out.println("Your last name doesn't match any in the animal list.");
            }
        }
    }
    
}