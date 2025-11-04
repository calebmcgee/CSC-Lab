import java.util.Scanner;
/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Switch Statement and String Comparison
Date : 10/21/25
 */

import javax.sound.midi.SysexMessage;

public class McGeeC_Lab7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        //Part A

        //Collect names from user
        System.out.print("Please enter a name: ");
        String name1 = keyboard.nextLine();
        System.out.print("Enter another name: ");
        String name2 = keyboard.nextLine();

        //Check if names are the same (check-case)
        if(name1.toUpperCase() == name2.toUpperCase()){
            System.out.println("SAME");
        } else {
            System.out.println("Different");
        }

        //Check if names are the same (ignore-case)
        if(name1 == name2){
            System.out.println("SAME");
        } else {
            System.out.println("Different");
        }
        //Check which name is longer
        if (name1.length() > name2.length()){
            System.out.println(name1 + " is longer with " + name1.length() + " characters.");
        } else {
            System.out.println(name2 + " is longer with " + name2.length() + " characters.");
        }
        //Print names in alphabetical order
        if (name1.toUpperCase().charAt(0) < name2.toUpperCase().charAt(0)){
            System.out.println(name1 + ", " + name2);
        } else {
            System.out.println(name2 + ", " + name1);

        }
        
        //Part B 
        System.out.print("Enter a major code (ex. CSC, CIS): ");
        String myMajor = keyboard.nextLine().toUpperCase();

        //Print full major name based on code
        switch(myMajor){
            case "CSC": 
                System.out.println("My major is Computer Science");
                break;
            case "CIS": 
                System.out.println("My major is Computer Information Systems");
                break;
            case "CYS": 
                System.out.println("My major is Cyber Security - Computer Science track");
                break;
            case "AIML": 
                System.out.println("My major is Artificial Intelligence and Machine Learning");
                break;
            case "MATH": 
                System.out.println("My major is Mathematics");
                break;
            case "CE": 
                System.out.println("My major is Computer Engineering");
                break;
            default: 
                System.out.println("Major code not in the list");
                break;
        }
        
        //Part C
        System.out.print("Please enter a first character of your LAST NAME: ");
        char myChar = keyboard.nextLine().charAt(0); 
        //Print animal name based on letter
        switch(myChar){
            case 'A','a': 
                System.out.println("A for Alligator");
                break;
            case 'B','b': 
                System.out.println("B for Buffalo");
                break;
            case 'C','c': 
                System.out.println("C for Camel");
                break;
            case 'D','d': 
                System.out.println("D for Donkey");
                break;
            default:
                System.out.println("Your last name doesn't match any in the animal list");
                break;
        }
        
        //Part D
        System.out.print("Enter an integer for score: ");
        int score = keyboard.nextInt();
        keyboard.nextLine();
        
        //Find if score higher/lower than 150
        System.out.println(score > 150 ? "Your score is higher than 150." : "Your score of " + score + " is lower or equal than 150.");
        
        //If else version
        if(score > 150){
            System.out.println("Your score is higher than 150.");
        }else {
            System.out.println("Your score of " + score + " is lower or equal than 150.");
        }
        
        //Number of Pennies
        System.out.print("Enter an integer for number of pennies: ");
        int count = keyboard.nextInt();
        keyboard.nextLine();
        
        //Penny count with conditional operator
        System.out.println(count == 1 ? "You have " + count + " penny." : "You have " + count + " pennies.");
        
        //If else version
        if (count == 1 ){
            System.out.println("You have " + count + " penny.");
        } else{
            System.out.println("You have " + count + " pennies.");
        }

        //Bonus Part
        System.out.print("Enter a name: ");
        String name_1 = keyboard.nextLine();
        System.out.print("Enter another name: ");
        String name_2 = keyboard.nextLine();
        System.out.print("Enter one more name: ");
        String name_3 = keyboard.nextLine();
        //Prints names based on order
        if(name_1.compareToIgnoreCase(name_2) < 0 && name_1.compareToIgnoreCase(name_3) < 0 ){
            System.out.print(name_1 + ", ");
            System.out.print(name_2.compareToIgnoreCase(name_3) < 0 ? name_2 + ", " + name_3 : name_3 + ", " + name_2);
        } else if (name_2.compareToIgnoreCase(name_3) < 0 && name_2.compareToIgnoreCase(name_3) < 0){
            System.out.print(name_2 + ", ");
            System.out.print(name_1.compareToIgnoreCase(name_3) < 0 ? name_1 + ", " + name_3 : name_3 + ", " + name_1);
        } else {
            System.out.print(name_3 + ", ");
            System.out.print(name_1.compareToIgnoreCase(name_2) < 0 ? name_1 + ", " + name_2 : name_2 + ", " + name_1);
        }
    }
    

}
