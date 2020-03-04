package com.company;
import java.util.Scanner;

/*
 *Student: Bilal Khan
 *Teacher: Mr.King
 *Class: ICS3UO - Gr.11 Comp Sci, Room 123
 */

public class PercentageCalculator {

    public static void main(String[] args) {
        //Declaration of the variables that are going to be used within the program
        Double FirstMark, SecondMark, ThirdMark, FourthMark, FifthMark;
        String Percent = "%";
        //Method that requires input from the user
	    Scanner Markscan = new Scanner(System.in);

	    //Introduction, description, and information on what the program will contain and how the user is supposed to do the work
        System.out.println("Mark Average Calculator");
        System.out.println("Note: Please respond to the blanks with accurate and non-alphabetical values.\n There are five blanks in which you are required to answer all of them.\n The result will print out the final percental value for your average.");
        System.out.println();

        //Prompts the user to provide the first percentage and sets it to FirstMark
        System.out.println("Please provide the first percentage: ");
        FirstMark = Markscan.nextDouble();

        //Prompts the user to provide the second percentage and sets it to SecondMark
        System.out.println("Please provide the second percentage: ");
        SecondMark = Markscan.nextDouble();

        //Prompts the user to provide the third percentage and sets it to ThirdMark
        System.out.println("Please provide the third percentage: ");
        ThirdMark = Markscan.nextDouble();

        //Prompts the user to provide the fourth percentage and sets it to FourthMark
        System.out.println("Please provide the fourth percentage: ");
        FourthMark = Markscan.nextDouble();

        //Prompts the user to provide the fifth percentage and sets it to FifthMark
        System.out.println("Please provide the last percentage: ");
        FifthMark = Markscan.nextDouble();

        /*
          Takes the user input and adds them from FirstMark, SecondMark, ThirdMark, FourthMark, and FifthMark.
          Divides the total, sets the value to variable result
         */
        Double result = ((FirstMark + SecondMark + ThirdMark + FourthMark + FifthMark) / 5);

        //Prints out the result based on user given data and returns a percent sign ("%").
        System.out.printf("The percentage result that you have obtained (given the five percentages) is: %.1f" + "%s", result, Percent);
    }
}
