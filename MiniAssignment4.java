package com.company;
import java.util.Scanner;
//package mini.assignment.pkg5;
/*
    *
        * @author 819147
    *
*/
public class MiniAssignment4 {
        public static void main(String[] args) {

            long n; //Variable used to calculate Fibonacci Sequence
            double goldenRatio = (1 + Math.sqrt(5)) / 2;
            //Formula for golden ratio within variable named goldenRatio^

            //Create a long Array with a amount of 50 variables max
            long[] FibSeq = new long[50];
            FibSeq[0] = 1; //first array element contains integer value of 1
            FibSeq[1] = 1; //second array element does the same

            //Take in the user input
            Scanner s = new Scanner(System.in);
            System.out.print("Enter value of n:");
            //Take in integer input and apply it to n
            n = s.nextInt();
            //for loop to iterate to iterate for user input stored in n
            for (int i = 0; i <= n - 1; i++) {
                //if i is greater than or equal to 2
                    if (i >= 2) {
                        //this is the fibonnaci sequence formula inorder to solve and print out the numbers
                        FibSeq[ i ] = FibSeq[ i - 2] + FibSeq[ i - 1 ];
                        //this is the Golden rato formula within a double
                        double GoldenRatio = (double)FibSeq[ i ] / (double)FibSeq[ i - 1];
                        //prints out the values from the array taking in parameter i and golden ratio.
                        System.out.println("1");
                        System.out.println("1");
                        System.out.printf("%d ⇰ %d ÷ %d = %1.15f\n", FibSeq[ i ], FibSeq[ i ], FibSeq[ i - 1 ], GoldenRatio);
                }
            }
            //This line prints out the final value for the Golden Ratio
            System.out.println("Golden Ratio: " + goldenRatio);
         }
    }