import java.util.Scanner;
/* 
Name: Caleb McGee
Instructor : Dr. B
Phone: 2025588376
Lab Section: 63
Description: While Sentinel Value and Running Total, and Nested Loop
Date : 11/4/25
 */
public class McGeeC_Lab10{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        //Part A 
        int num = 0;
        int countOdd = 0;
        int countEven = 0; 
        int sumOdd = 0;
        int sumEven = 0;
        //Adds numbers until input is -1
        while(num != -1){
            System.out.print("Enter an integer [-1 to exit]: ");
            num = keyboard.nextInt();
            if(num % 2 != 0 && num != -1){
                System.out.println("\t" + num + " is odd");
                sumOdd += num;
                countOdd += 1;
            } else if (num % 2 == 0 && num != 0) {
                System.out.println("\t"+  num + " is even");
                sumEven += num;
                countEven += 1;
            }
        }
        keyboard.nextLine();

        System.out.println("*** You entered " + (countEven + countOdd) + " numbers:");
        System.out.println("\t" + countOdd + " odd integers; a total of " + sumOdd);
        System.out.println("\t" + countEven + " even integers; a total of " + sumEven);
        
        //Part B
        
        char repeat = 'n';
        //Part C (Added do while)
        do {
            //Prompt for pattern
            System.out.print("What character do you want to use for pattern? ");
            char pattern = keyboard.nextLine().charAt(0);
            System.out.print("How many rows to print? ");
            int row = keyboard.nextInt();
            System.out.print("How many columns to print? ");
            int col = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Printing " + pattern + " for " + row + " rows and " + col +" columns: ");
            //Print Pattern
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    System.out.print(pattern);
                }
                System.out.print("\n");
            }
            //Check if repeat
            System.out.println("Would you like to repeat [Y/y]: ");
            repeat = keyboard.nextLine().toLowerCase().charAt(0);
        } while (repeat == 'y');
        
        //Part D
        System.out.println("\t*** Enter a Limit ***");
        System.out.print("\tPlease enter an integer number for limit (5 - 10): ");
        int limit = keyboard.nextInt();
        while (limit < 5 || limit > 10){
            System.out.println("\tValue is outside of range.");
            System.out.print("\tPlease enter an integer number for limit (5 - 10): ");
            limit = keyboard.nextInt();
        }
        System.out.println("\t*** Enter a Power ***");
        System.out.print("\tPlease enter an integer number for power (at least 2): ");
        int power = keyboard.nextInt();
        while (power < 2){
            System.out.println("\tValue is outside of range.");
            System.out.print("\tPlease enter an integer number for power (at least 2): ");
            power = keyboard.nextInt();
        }
        //Print powers up to limit
        System.out.println("Number  Power of " + power);
        for (int i = 1; i <= limit; i++){
            System.out.println(i + "\t" + (int)(Math.pow(i, power)));
        }   
        
    }
}