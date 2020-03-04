package com.company;
import java.util.Scanner;
/*
    *Student ID: QCFVZE
    * Teacher Name: Mr.King, ICS3UO
*/

public class UniversityExpenseCalc {
        public static void main(String[] args) {

            //Declaration of Variables and Arrays that are going to be used within this program
            double[] WaterlooFees, TorontoFees, McMasterFees;
            //Declaration for Scanner that takes in user input
            Scanner OptionsScan = new Scanner(System.in);
            //Declaration for strings that will be used within the program for better user experience
            String WaterlooUni = "a) Waterloo University",
                    TorontoUni = "b) McMaster University",
                    McMasterUni = "c) University of Toronto";

            //Brief introduction of how the code is going to run and what the user has to input
            System.out.println("--University Expenses Calculator--");
            System.out.println("Please choose which type of University you would like to apply to:");
            System.out.println(WaterlooUni + " OR " + TorontoUni + " OR " + McMasterUni);
            //Scanner being used here:
            String Option = OptionsScan.next();

            //Once the user inputa a, b , or c, then the code is forwarded to a switch statement where it will then decide on which case to construct
            switch(Option.toLowerCase()){
                case "a":
                    //Gives the user another brief introduction of which university they have chosen and what it required from them
                    System.out.println("Expenses (For Waterloo University):");
                    //For loop that iterates 2 times inorder to result in a list using the printf statement
                    for (int i = 0; i < 1; i++) {
                        //Declaration for Scanner which will be used further ahead of the for loop
                        Scanner Payment = new Scanner(System.in);
                        //Declaration of fees for Waterloo as elements within a double array
                        WaterlooFees = new double[]{15640, 2290, 0};

                        //Prints out the WaterlooFees double array in an ordered list 2 times due to the code being within a for loop
                        System.out.printf("Tuition:$%.2f\tBooks/Supplies:$%.1f\tOther:$%.1f\t", WaterlooFees[0], WaterlooFees[1], WaterlooFees[2] );
                        System.out.println();
                        //This requires user input on wether the user is able to pay the required amount, if so then the user is prompted to input the total
                        System.out.println("State how much you are able to pay:");
                        //Takes in user input and sets it to double Response
                        double Response = Payment.nextInt();

                        //CatchPayment returns all fees added by eachother and subtracted by how much the user is willing to pay
                        double CatchPayment = Response -  WaterlooFees[0] + WaterlooFees[1] + WaterlooFees[2];
                        //If the user is able to pay all then returns how much the user has payed. If not then returns how much user has payed plus how much user needs to pay
                        System.out.printf("You are able to pay: $%.1f\nYou require: $%.1f", Response, CatchPayment);
                    }
                    break;
                case "b":
                    //Gives the user another brief introduction of which university they have chosen and what it required from them
                    System.out.println("Expenses (For McMasters University)");
                    //For loop that iterates 2 times inorder to result in a list using the printf statement
                    for (int i = 0; i < 1; i++) {
                        //Declaration for Scanner which will be used further ahead of the for loop
                        Scanner Payment = new Scanner(System.in);
                        //Declaration of fees for Waterloo as elements within a double array
                        McMasterFees = new double[]{34823.70, 4355, 1215};

                        //Prints out the McMastersFees double array in an ordered list 2 times due to the code being within a for loop
                        System.out.printf("Tuition:$%.2f\tBooks/Supplies:$%.1f\tOther:$%.1f\t", McMasterFees[0], McMasterFees[1], McMasterFees[2] );
                        System.out.println();
                        //This requires user input on wether the user is able to pay the required amount, if so then the user is prompted to input the total
                        System.out.println("State how much you are able to pay:");
                        //Takes in user input and sets it to double Response
                        double Response = Payment.nextInt();

                        //CatchPayment returns all fees added by eachother and subtracted by how much the user is willing to pay
                        double CatchPayment = Response - McMasterFees[0] + McMasterFees[1] + McMasterFees[2];
                        //If the user is able to pay all then returns how much the user has payed. If not then returns how much user has payed plus how much user needs to pay
                        System.out.printf("You are able to pay: $%.1f\nYou require: $%.1f", Response, CatchPayment);
                    }
                    break;
                case "c":
                    //Gives the user another brief introduction of which university they have chosen and what it required from them
                    System.out.println("Expenses (For University of Toronto)");
                    //For loop that iterates 2 times inorder to result in a list using the printf statement
                    for (int i = 0; i < 1; i++) {
                        //Declaration for Scanner which will be used further ahead of the for loop
                        Scanner Payment = new Scanner(System.in);
                        //Declaration of fees for Waterloo as elements within a double array
                        TorontoFees = new double[]{50000, 2543, 1777};

                        //Prints out the TorontoFees double array in an ordered list 2 times due to the code being within a for loop
                        System.out.printf("Tuition:$%.2f\tBooks/Supplies:$%.1f\tOther:$%.1f\t", TorontoFees[0], TorontoFees[1], TorontoFees[2] );
                        System.out.println();
                        //This requires user input on wether the user is able to pay the required amount, if so then the user is prompted to input the total
                        System.out.println("State how much you are able to pay:");
                        //Takes in user input and sets it to double Response
                        double Response = Payment.nextInt();

                        //CatchPayment returns all fees added by eachother and subtracted by how much the user is willing to pay
                        double CatchPayment = Response - TorontoFees[0] + TorontoFees[1] + TorontoFees[2];
                        //If the user is able to pay all then returns how much the user has payed. If not then returns how much user has payed plus how much user needs to pay
                        System.out.printf("You are able to pay: $%.1f\nYou require: $%.1f", Response, CatchPayment);
                    }
                    break;
            }
        }
    }
