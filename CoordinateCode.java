package com.company;
import java.util.Scanner;
import java.lang.Math.*;

public class CoordinateCode {
    public static void main(String[] args) {
        //declare 4 variables that will require user input
        int x1, x2, y1, y2;

        //declare double distance that will return result
        double dis;

        //new scanner that will take in user input for X1
        Scanner sc = new Scanner(System.in);

        //gives the user the option to put input for x1 point
        System.out.println("Enter X1 point:");
        x1 = sc.nextInt();
        //variable x1 input is the input from above ^

        //gives the user the option to put input for x2 point
        System.out.println("Enter X2 point:");
        y1 = sc.nextInt();
        //variable x2 input is the input from above ^

        //gives the user the option to put input for y1 point
        System.out.println("Enter Y1 point:");
        x2 = sc.nextInt();
        //variable y1 input is the input from above ^

        //gives the user the option to put input for y2 point
        System.out.println("Enter Y2 point:");
        y2 = sc.nextInt();
        //variable y2 input is the input from above ^

        //takes the values from x1,x2,y1, and y2 and uses the variable input to calculate distance (using formula)

        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        //prints result from the distance calculation
        System.out.println("distance between the two points: " + "(" + x1 + ", " + y1 + "), " + "(" + x2 + ", " + y2 + ") ===> " + dis);
    }
}
