import java.util.Scanner;
import java.util.Random;
/* 
Name: Caleb McGee
Instructor : Dr. B
Lab Section: 63
Description: Random Number and review Chapter 4
Date : 10/28/25
 */
public class McGeeC_Lab8 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        //Part A
        Random rand = new Random();
        int dice1 = rand.nextInt(6)+1, dice2 = rand.nextInt(6)+1, dice3 = rand.nextInt(6)+1, dice4 = rand.nextInt(6)+1;
        int sum = dice1 + dice2 + dice3 + dice4;
        System.out.println("Dice are " + dice1 + ", " + dice2 + ", " + dice3 + ", " + dice4+ ", with sum = " + sum);

        //Roll height
        if (sum >= 18){
            System.out.println("You got a high roll.");
        } else if (sum < 10) {
            System.out.println("You got a low roll, try better luck nest time!");
        } else {
            System.out.println("You got a medium roll.");
        }
        //Part B
        int stars = rand.nextInt(10)+1;
        System.out.print(stars + " ");
        switch(stars){
            case 1:
                System.out.println("*");
                break;
            case 2:
                System.out.println("**");
                break;
            case 3:
                System.out.println("***");
                break;
            case 4:
                System.out.println("****");
                break;
            case 5:
                System.out.println("*****");
                break;
            case 6:
                System.out.println("******");
                break;
            case 7:
                System.out.println("*******");
                break;
            case 8:
                System.out.println("********");
                break;
            case 9:
                System.out.println("*********");
                break;
            case 10:
                System.out.println("**********");
                break;
            default:
            System.out.println("Error");
        }
        //Part C
        System.out.print("Please enter a name: ");
        String name1 = keyboard.nextLine();
        System.out.print("Please enter another name: ");
        String name2 = keyboard.nextLine();
        System.out.print("Please enter a one more name: ");
        String name3 = keyboard.nextLine();

        //Comparison
         if(name1.equals(name2) && name1.equals(name3)){
            System.out.println("SAME");
        } else {
            System.out.println("Different");
        }
        if(name1.equalsIgnoreCase(name2) && name1.equalsIgnoreCase(name3)){
            System.out.println("SAME");
        } else {
            System.out.println("Different");
        }
        //Print in order
        if (name1.compareTo(name2) <= 0 && name2.compareTo(name3) <= 0){
            System.out.println(name1 + ", " + name2 + ", " + name3);
        } else if(name1.compareTo(name2) <= 0 && name2.compareTo(name3) > 0){
            System.out.println(name1 + ", " + name3 + ", " + name2);
        } else if(name2.compareTo(name1) <= 0 && name1.compareTo(name3) <= 0){
            System.out.println(name2 + ", " + name1 + ", " + name3);
        } else if(name2.compareTo(name1) <= 0 && name1.compareTo(name3) > 0){
            System.out.println(name2 + ", " + name3 + ", " + name1);
        } else if(name3.compareTo(name1) <= 0 && name1.compareTo(name2) <= 0){
            System.out.println(name3 + ", " + name1 + ", " + name2);
        } else if(name3.compareTo(name1) <= 0 && name1.compareTo(name2) > 0){
            System.out.println(name3 + ", " + name2 + ", " + name1);
        }
        
        //Part D
        String cityInfo;
        System.out.print("Please enter 3-digit area code for your phone number: ");
        int areaCode = keyboard.nextInt();
        switch(areaCode){
            case 212:
                cityInfo = "New York City, NY";
                break;
            case 202:
                cityInfo = "Washington, DC";
                //This is my area code
                break;
            case 213:
                cityInfo = "Los Angeles, CA";
                break;
            case 305:
                cityInfo = "Miami, FL";
                break;
            case 757:
                cityInfo = "Hampton, VA";
                break;
            default:
                cityInfo = "No Area Code Found";
        }
        System.out.println("Your phone area code " + areaCode + " is " + cityInfo + ".");
        



    }
}
