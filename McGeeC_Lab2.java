/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: User Input, Arithmetic Operations, 
            String Manipulation + review
Date : 9/9/25
 */
import java.util.Scanner;
public class McGeeC_Lab2 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        //A
       
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        System.out.print("What is your age? ");
        int age = keyboard.nextInt();
        System.out.print("What is your gpa? ");
        double gpa = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("What is your major? ");
        String major = keyboard.nextLine();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("gpa is " + gpa);
        System.out.println("Major is " + major);
        //B
        int size = name.length();
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        char firstLetter = name.charAt(0);
        System.out.println("Name is " + name + ", has " + size + " characters.");
        System.out.println("UPPERCASE of name is " + upper);
        System.out.println("lowercase of name is " + lower);
        System.out.println("The first character of the name is " + firstLetter);
        //C
        Boolean flag = true;
        System.out.println("The flag is " + flag);
        double myAnswer1 = Math.pow(7, 8);
        System.out.println("The result of 7 power 8 is " + myAnswer1);
        double myAnswer2 = Math.sqrt(273);
        System.out.println("The result of square root of 273 is " + myAnswer2);
        double myAnswer3 = Math.sqrt((Math.pow(age,4))- size)/5;
        System.out.println("The calculation is " + myAnswer3);
        
        //D
        int dividend = 15, divisor = 4;
        int quotient, remainder;
        quotient = dividend/divisor;
        remainder = dividend % divisor;
        System.out.println("When " + dividend + " is divided by " + divisor + ", the quotient is " + quotient + " and the remainder is " + remainder);
        int x = 8, y = 4, z = 14, s = 15;
        x %= 5;
        y += z;
        s *= 5;
        z /= 4;
        System.out.println("x is " + x + ", y is " + y + ", z is " + z + ", s is " + s);
    


        /* Program Challenge #15
        Ingredient Adjuster
        A cookie recipe calls for the following ingredients:

        1.5 cups of sugar
        1 cup of butter
        2.75 cups of flour

        The recipe produces 48 cookies with these amounts of the ingredients. 
        Write a program that asks the user how many cookies he or she wants to make, 
        then displays the number of cups of each ingredient needed for the specified number of cookies.
         */

        double sugar = 1.5/48;
        double butter = 1.0/48;
        double flour = 2.75/48;
        System.out.print("How many cookies would you like to make? ");
        int cookies = keyboard.nextInt();
        

        System.out.println("To make " + cookies + " cookies, you will need: \n " + (sugar*cookies) + " cups of sugar, \n " + (butter*cookies) + " cups of butter, \n " + (flour*cookies) + " cups of flour");


        /* Program challenge #17
        Word Game
        Write a program that plays a word game with the user. The program should ask the user to enter the following:

        His or her name
        His or her age
        The name of a city
        The name of a college
        A profession
        A type of animal
        A pet’s name

        After the user has entered these items, the program should display the following story, 
        inserting the user’s input into the appropriate locations:
        There once was a person named NAME who lived in CITY. At the age of AGE, NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after!
         */

        Scanner storyScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String storyName = storyScanner.nextLine();
        System.out.print("Enter your age: ");
        int storyAge = storyScanner.nextInt();
        System.out.print("Enter a city: ");
        storyScanner.nextLine();
        String city = storyScanner.nextLine();
        System.out.print("Enter a college: ");
        String college = storyScanner.nextLine();
        System.out.print("Enter a profession: ");
        String profession = storyScanner.nextLine();
        System.out.print("Enter a type of animal : ");
        String animal = storyScanner.nextLine();
        System.out.print("Enter a pet's name: ");
        String pet = storyScanner.nextLine();

        System.out.print("There once was a person named "  + storyName +  " who lived in " + city + ". At the age of " + storyAge + ", " + storyName + " went to college at " + college + ". " + storyName + "  graduated and went to work as a " + profession + ". Then, " + storyName + " adopted a(n) "  + animal + " named " + pet + ". They both lived happily ever after!");

    }
}
