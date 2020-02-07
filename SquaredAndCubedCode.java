package com.company;
import java.util.Scanner;

public class SquaredAndCubedCode {
    public static void main(String[] args){

        double EndResult = 0.0;
        double EndResult2 = 0.0;

                //Initialize Scanner sc to take in input from the user for variable Num
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the amount of numbers you would like to square and cube: ");
        double Num = sc.nextInt(); //Variable Num is going to hold user input

        //This is the title for the table that is going 10to stimulate squared and cubed numbers
        System.out.println("   ▒Squared▒ ▒Cubed▒");

        //for loop for iterating between the numbers and checking if i is less than variable Num
        for(int i = 1; i <= Num;)
        {
            //for loop to check if j is less or equal to variable Num and printing its value(s)
            for(int j = 1; j <= Num; j++){

                //Square i and place it into variable SquaredNum
                double SquaredNum = +i;
                EndResult = SquaredNum;

                //Cube i and place it into variable CubedNum
                double CubedNum =  Math.pow(i, 3);
                EndResult2 = CubedNum;

                //constantly adds itself after the above algorithms are finished^
                i++;

                //Prints out the result in a Printf string statement
                System.out.printf(" %d \t %1.1f \t %1.1f", j , SquaredNum, CubedNum);
                System.out.println();
            }
        }

        System.out.println("Value of  Squared : " +  Math.pow(EndResult, 2));
        System.out.println("Value of Cubed : " + EndResult2);
    }
}
