/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Review for Final Exam - Chapter 2,4, and 5
Date : 11/18/25
 */
import java.util.Scanner;
import java.util.Random;
public class McGeeC_Lab11 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        //Part A
        String name = "";
        int score = 0;
        int sum = 0;
        double average = 0;
        double totalAverage = 0;
        double overallAverage = 0;
        //Outer loop for each person
        for (int i = 0; i < 3; i++){
            System.out.print("Enter a name: ");
            name = keyboard.nextLine();
            sum = 0;
            //Inner Loop for each score
            for (int j = 0; j < 5; j++){
                System.out.print("Enter a score (0-100): ");
                score = keyboard.nextInt();
                keyboard.nextLine();
                sum += score;
            }
            System.out.println();
            //Calculations for each person
            average = sum/5.0;
            totalAverage += average;
            System.out.println("\t" + name + "'s total score is " + score + " and average is " + average);
            System.out.println();
        }
        overallAverage = totalAverage/3.0;
        System.out.println("The total average of 3 students is " + totalAverage + " and overall average is " + overallAverage);
        
        //Part B
        char repeat = ' ';
        do {
            int randomToGuess;
            int attemptCount = 1;
            randomToGuess = rand.nextInt(101);
            System.out.print("Guess a number (0-100): ");
            int guessNumber = keyboard.nextInt();
            while(guessNumber != randomToGuess){
                //Tells you if higher/lower for incorrect guess
                if(guessNumber < randomToGuess){
                    System.out.print("Higher, guess again (0-100): ");
                    guessNumber = keyboard.nextInt();
                    attemptCount ++;
                } else {
                    System.out.print("Lower, guess again (0-100): ");
                    guessNumber = keyboard.nextInt();
                    attemptCount ++;
                }
            }
            System.out.println("Good Job!! It took you " + attemptCount + " attempts.");
            keyboard.nextLine();
            //Decide wether or not to repeat
            System.out.print("Do you want to repeat [Y or y] ");
            repeat = keyboard.nextLine().charAt(0);
        } while (repeat == 'Y' || repeat == 'y');
        
        //Part C 
        char choice = ' ';
        System.out.print("Choose a letter (A, B, C, or D): ");
        choice = keyboard.nextLine().toUpperCase().charAt(0);
        //Make sure choice in range A-D
        while(choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D'){
             System.out.print("Letter out of range. Choose a letter (A, B, C, or D): ");
             choice = keyboard.nextLine().toUpperCase().charAt(0);
        }
        //Print based on choice
        switch(choice){
            case 'A':
                System.out.println("A for Apple");
                break;
            case 'B':
                System.out.println("B for Banana");
                break;
            case 'C':
                System.out.println("C for Cantaloupe");
                break;
            case 'D':
                System.out.println("D for Dragon Fruit");
                break;
            default:
                return;
        }
        
        //Part D
        System.out.print("Enter an airport code (ORF, PHF, DCA, BWI, or ): ");
        String code = keyboard.nextLine().toUpperCase();
        //Match code to airport
        switch (code){
            case "ORF":
                System.out.println(code + " is Norfolk International Airport, Norfolk, VA");
                break;
            case "PHF":
                System.out.println(code + " is Newport News International Airoprt, Newport News, VA");
                break;  
            case "BWI":
                System.out.println(code + " is Baltimore-Washington International Thurgood Marshall Airport, Baltimore, MD");
                break;
            case "DCA":
                System.out.println(code + " is Reagan National Airport, Washington, DC");
                break;
            case "ATL":
                System.out.println(code + " is Hartsfield-Jackson Atlanta International Airport, Atlanta, GA");
                break;
            default:
                System.out.println(code + " Airport code not in the list"); 
        }
        
        //Part E
        System.out.print("Enter an integer for a: ");
        int a = keyboard.nextInt();
        System.out.print("Enter an integer for b: ");
        int b = keyboard.nextInt();
        System.out.print("Enter an decimal number for m: ");
        double m = keyboard.nextDouble();
        final double RATE = 9.75;
        int result1 = (int) Math.pow(a,7) + (int) (6*RATE) - (int) Math.sqrt(a*b*m);
        double result2 = ((double)(3*a-6*b+7)/5)+(double)((2*b%a)+9*a)/4;
        System.out.println("You entered: a = " + a + ", b = " + b + ", m = " + m + ", and RATE = " + RATE + ".");
        System.out.println("\tresult1 is " + result1 + ".");
        System.out.println("\tresult2 is " + result2 + ".");
        
        //Part F
        keyboard.nextLine();
        //user inputs
        System.out.print("Enter your full name: ");
        String fullName = keyboard.nextLine();
        System.out.print("Enter your major: ");
        String major = keyboard.nextLine();
        System.out.print("Enter your gpa: ");
        double gpa = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter your favorite sport: ");
        String sport = keyboard.nextLine();
        System.out.print("Enter a number: ");
        int count = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter your favorite animal: ");
        String animal = keyboard.nextLine();
        //String Manipulation
        int totalChars = fullName.length() + major.length() + sport.length();
        String upper = sport.toUpperCase();
        char firstLetter = sport.charAt(0);
        char lastLetter = animal.toUpperCase().charAt(animal.length()-1);
        //formatted output
        System.out.println("Hello, my name is " + fullName + ". At \"Hampton University,\" my major is " + major + " with " + gpa + ". \nI love " + upper + ", and I have " + count + " " + animal + "s at home. \nThere is a total of " + totalChars + " characters in our Strings.\n\tThe first character of " + sport + " is " + firstLetter + ".\n\tThe last character of " + animal + " is " + lastLetter + "."); 
        
    }
}
