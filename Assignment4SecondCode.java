package com.company;
import java.util.Scanner;

public class Assignment4SecondCode {

        public static void main(String[] args) {
            //Declaration fro the variables later used for the formulas
            double CubedFormula;
            double SquaredFormula= 0;
            double CubeResult = 0;
            //Declaration of the scanner used to scan the user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("This is the formula we are trying to check: 1 + 2 + 3 + ... + n)^2 = (1^3+2^3+3^3+ ... + n^3");
            System.out.println("Please set the value of n (The value of n is going to result in both of the formulas being used and resulting in the same value);");

            System.out.println("Enter the Value of n:");
            //the value of n is the value of the input from the user
            int n = scanner.nextInt();


            //Prints to see if both of the values are equal or not
            System.out.println("Let's Test to see if both of the formula's will result to the same values:");

            /* Declaration of new double array that will take in the values of n(which is user input) */
            double[] TermNumbers = new double[n];

            /* This forloop adds the value from the incrementation of i into TermNumbers */
            for (int i = 0; i < n; i++){
                TermNumbers[i] = i + 1;
            }

            //Foreach term within TermNumbers, then print the values of them using the formulas for the code
            for (double term : TermNumbers) {
                //This is for the Squared formula that is going to be put up to the test of if it equals the Cubed formula
                CubedFormula = Math.pow(term, 3);
                //This is for the Cubed formula that is going to be put up to the test of if it equals the Squared formula
                SquaredFormula = SquaredFormula + term;
                //CubeResult is going to be the addition of 2 values from Cubedformula and the original result from Cubedformula
                CubeResult = CubeResult + CubedFormula;
            }
            //Print Statement for the layout of how the 2 formulas are going to be printed

            System.out.printf("%1f \t = \t %1f", Math.pow(SquaredFormula, 2), CubeResult);
        }
    }
