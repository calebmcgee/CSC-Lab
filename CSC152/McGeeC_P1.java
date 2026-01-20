/********************************************************************************
YOU MUST KEEP THE CODE OUTLIINE and COMMENTS AS GIVEN
* only Program Assignment 1 that you will be given the outline
so that you will see what basic information that you will have
at the beginning of Program Assignment
DUE Wednesday, January 29, 11:59 PM EST
*********************************************************************************/
// *******************************************************************
// CSC 152 - Computer Programming II - Dr.Aneke
//
// Programmed Assignment 1 by : Caleb McGee
// 00588035
// Computer Science
//
// Location where you completed this assignment (lab / apt / dorm): LAB
// Tutor, if any (who help you with this program assignment): [[TUTOR]]
//
// *******************************************************************
import java.util.Scanner;
import java.util.Date; // DO NOT REMOVE THIS LINE
// (1) Import additional class(es) below
public class McGeeC_P1
    // make sure that you change LASNAME to your last name
    // change initial to your first name initial
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String myName = "Caleb McGee"; // put your full name here
        String myMajor = "Computer Science"; // put your major here
        System.out.println ( "\nSpring 2025 Program 1 by " + myName + "\n\n");
        System.out.println ( " I, Caleb McGee, did not receive any assistant\n" + " from another person except CSC 152 instructors\n" + " and assigned tutors.\n\n");
        // completed by Caleb McGee
        /* Begin your code here :: Caleb McGee */
        // (2) Create an object to read an input from a keyboard
        // (3) Input 2 integers and 1 double (including declare variables) and 1 String
        // Note that you must add _XXX, where XXX are your initials (first, middle, last)
        // at the end of each variable
        // (4) Calculate several math expressions (including declare variables)
        // by Caleb McGee
        // (5) Output results by Caleb McGee
        // (6) String manipulation - make sure that you use methods defined in String class
        /* code completion by Caleb Mcgee */

        //Get info from user
        System.out.print("Enter an integer for a >>>> ");
        int a = keyboard.nextInt();
        System.out.print("Enter an integer for b >>>> ");
        int b = keyboard.nextInt();
        System.out.print("Enter a decimal number for r >>>> ");
        double r = keyboard.nextDouble();
        keyboard.nextLine(); //clear buffer
        System.out.print("Enter your name >>>> ");
        String name = keyboard.nextLine(); 

        //Calculations
        int result1 = (int) Math.pow(a,7) + (5*9);
        int result2 = (int) Math.pow(a,4) - (8*a*b) + (int) Math.pow(b, 5);
        double result3 = (((2.0*a)-5.0)/18.0)+(((33.0*b)-77.0)/133.0);
        double result4 = (55.0*Math.pow(r,111.0) + 33.0)/77.0;


        //Print info
        System.out.println("\n" + name + ", your value inputs were: " + "\n\ta = " + a + "\n\tb = " + b + "\n\tr = " + r);
        System.out.println("\n" + "Calculated results were: " + "\n\tresult1 = " + result1 + "\n\tresult2 = " + result2 + "\n\tresult3 = " + result3 + "\n\tresult4 = " + result4);

        //Ask to enter hometown
        System.out.print("\nPlease enter your hometown (City and State): ");
        String hometown = keyboard.nextLine();
        String uppercase = hometown.toUpperCase();
        String lowercase = hometown.toLowerCase();
        char lastcharupper = uppercase.charAt(uppercase.length()-1);

        //Print hometown
        System.out.println("\n" + name + ", your hometown is " + hometown + "\t(" + hometown.length() + " characters)\n\tUpper Case ==> " + uppercase + "\n\tLower Case ==> " + lowercase + "\n\tThe last character of your hometown is " + lastcharupper);

        /*
        ===================================================================================
        ==
        DO NOT CHANGE ANY CODE AFTER THESE SECTION
        ONLY UPDATE IN COMMENTS AREAe
        */
        //********************* DO NOT REMOVE THIS CODE ****************************
        // This is to print at the end showing the completion and timestap
        System.out.println ( "\nProgram 1 is completed by " + myName);
        Date today = new Date();
        System.out.println(today);
        System.out.println ( "\n\n");
    } // end main
}
// This program is for CSC 152 class for Dr. Boonthum or Dr. Aneke
// Spring 2025 - Due January 29
// Caleb McGee

