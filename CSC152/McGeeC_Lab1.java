/*
Name : Caleb McGee
Lab section : 
Lab instructor : Dr Aneke
Description : Review Writing a Java Program with User Input
    from Keyboard, basic calculation, basic String manipulation, and
    basic conditioning statements
Date : 01/14/26
*/
import java.util.Scanner;

public class McGeeC_Lab1 {
    public static void main(String args[]){
        //Define Scanner
        Scanner kb = new Scanner(System.in);  
        
        //Ask user to input information
        System.out.print("Please enter first name : ");
        String firstName = kb.nextLine();
        System.out.print("Please enter last name : ");
        String lastName = kb.nextLine();
        System.out.print("Please enter age : ");
        int age = kb.nextInt();
        kb.nextLine();
        System.out.print("Please enter major : ");
        String major = kb.nextLine();
        System.out.print("Please enter full name : ");
        String fullName = kb.nextLine();

        System.out.println("Hello, my name is " + firstName + lastName + ". I am " + age + " years old and my major is " + major + "\nMy full name contains " + fullName.length() + " number of characters.\nMy full name in uppercase is " + fullName.toUpperCase() + ".\nThe last character of my last name in upper case is " + lastName.toUpperCase().charAt(lastName.length() - 1) + ".");
        

        //Ask user to input numbers
        System.out.print("Please enter 2 numbers : ");
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int sum = num1 + num2;
        double average = sum/2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".\nThe average of " + num1 + " and " + num2 + " is " + average + ".");

        //Ask user to input doubles
        System.out.print("Please enter 5 numbers : ");
        double d1 = kb.nextInt();
        double d2 = kb.nextInt();
        double d3 = kb.nextInt();
        double d4 = kb.nextInt();
        double d5 = kb.nextInt();
        kb.nextLine();
        double sumDouble = d1 + d2 + d3 + d4 + d5;
        double averageDouble = sumDouble/5;

        System.out.println("Values are " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", and " + d5 + ".\n" + "Sum of these values is " + sumDouble + ".\n" + "Average of these values is " + averageDouble + ".");

        //Check relationship between numbers
        if (num1 < num2){
            System.out.println("Based on user input (" + num1 + " and " + num2 + "), num1 is lower than num2");

        } else if (num1 > num2){
            System.out.println("Based on user input (" + num1 + " and " + num2 + "), num1 is higher than num2");
        }else if (num1 == num2){
            System.out.println("Based on user input (" + num1 + " and " + num2 + "), num1 is equal to num2");
        }

        //Switch Statement
        System.out.print("Enter the first character of your last name: ");
        char myChar = kb.nextLine().toUpperCase().charAt(0);

        switch (myChar) {
            case 'A':
                System.out.println("A for Alligator");
                break;
            case 'B':
                System.out.println("B for Bird");
                break;
            case 'C':
                System.out.println("C for Camal");
            break;
            case 'D':
                System.out.println("D for Dog");
                break;
            default:
                System.out.println("Your last name doesn’t match any in the animal list");
        }
        //Compare two strings

        System.out.print("Enter the first name: ");
        String name1 = kb.nextLine();
        System.out.print("Enter the second name: ");
        String name2 = kb.nextLine();

        if (name1.equals(name2)) {
            System.out.println(name1 + " and " + name2 + " are the same.");
        } else {
            if (name1.compareToIgnoreCase(name2) < 0) {
                System.out.println(name1 + ", " + name2);
            } else {
                System.out.println(name2 + ", " + name1);
            }
        }
    }
}