import java.util.Scanner;
public class McGeeC_P1 {
/*
Name: Caleb McGee
Location: Dorm
Tutors: None
 */
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
    
        //Ask user a prompt and save answer in variable
        System.out.print("Enter the name of a planet: ");
        String planet = keyboard.nextLine();
        System.out.print("Enter a title (ex. Sir/Madam/Captain): ");
        String title = keyboard.nextLine();
        System.out.print("Enter the name of a person: ");
        String person1 = keyboard.nextLine();
        System.out.print("Enter a pronoun (ex. He/She/They): ");
        String pronoun = keyboard.nextLine();
        System.out.print("Enter the name of another person: ");
        String person2 = keyboard.nextLine();
        System.out.print("Enter the name of a superhero: ");
        String superhero = keyboard.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective1 = keyboard.nextLine();
        System.out.print("Enter another adjective: ");
        String adjective2 = keyboard.nextLine();
        System.out.print("Enter a color: ");
        String color = keyboard.nextLine();
        String colorAllCaps = color.toUpperCase();
        System.out.print("Enter a positive integer: ");
        int years = keyboard.nextInt();
        double halfYears = (double)years/2.0;
        double manyYears = (double)years*5.2;
        System.out.print("Enter another positive integer: ");
        int roomNum  = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter a noun: ");
        String noun = keyboard.nextLine();
        String nounAllCaps = noun.toUpperCase();

        //Print out responses in story form
        System.out.println(years + " years ago on the planet " + planet + " the very " + adjective1 + " " + title + " " + person1 + " desperately needed to find a " + color + " " + noun +". " + pronoun + " asked " + superhero + " to help find a " + color + " " + noun + " but no " + color + " " + noun + " could be found. " + halfYears + " years after the search began " + title + " " + person1 + " and " + superhero + " enlisted the help of the " + adjective2 + " " + person2 + ". " + title + " " + person1 + " yelled \"I need a " + colorAllCaps + " " + nounAllCaps + "!! I don’t want to wait " + manyYears + " more years!!\" " + person2 + " found a " + color + " " + noun + " for " + title + " " + person1 + " in S&T " + roomNum + " and they all lived happily ever after.");

        //PART 2

        //Prompts user for input and saves in variable
        System.out.print("Enter an integer: ");
        int a_CEM = keyboard.nextInt();
        System.out.print("Enter another integer: ");
        int b_CEM = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter a decimal number: ");
        double r_CEM = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter your name: ");
        String name_CEM = keyboard.nextLine();

        //Assigning calculations to variable 
        int result1 = (int)Math.pow(a_CEM,7) + 5 * 9;
        int result2 = (int)Math.pow(a_CEM,4) - (8*a_CEM*b_CEM) + (int)Math.pow(b_CEM,5);
        double result3 = Math.sqrt(result2) + Math.sqrt(result1);
        double result4 = (double)Math.pow(result3, 2);

        //Print out values
        System.out.println("a is " + a_CEM);
        System.out.println("b is " + b_CEM);
        System.out.println("r is " + r_CEM);
        System.out.println("name is " + name_CEM);
        System.out.println("Result 1 is " + result1);
        System.out.println("Result 2 is " + result2);
        System.out.println("Result 3 is " + result3);
        System.out.println("Result 4 is " + result4);



    }
}
