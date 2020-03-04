package com.company;
import java.util.Scanner;

/*
 *Student ID: QCFVZE
 * Teacher Name: Mr.King, ICS3UO
 */

public class MonthYearDayCalc {
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE colour for text
    public static final String RED = "\033[0;31m";     // RED colour for text
    public static final String GREEN = "\033[0;32m";   // GREEN colour for text
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) {
        //Declarations for variables that require user input
        int Months;
        int Years;
        boolean more = true;
        //                    0           1         2        3       4     5      6       7         8          9        10          11
        String[] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //Declaration of Scanner that requires user input
        Scanner YEsNo = new Scanner(System.in);
        Scanner Calculation = new Scanner(System.in);
        //This whole program is within a do loop just in case the user wants to conintue the application rather than restarting
        do{
        //Brief introduction of how the program works and explaination to the user of how and what the user need to input inorder to get output
        System.out.println("--Days Given Certain Month and Year Calculator--");
        System.out.println("This program requires the user to input the first 2 values inorder to calculate initial day:\n requires Month and Year inorder to Calculate a Certain Month and how many days there are.");
        System.out.println();
        //Prompts user to input the year given the range of 1600 to 2600
        System.out.print("Please Provide the Year (Range: 1600 - 2600): ");
        //Takes in user input and sets it to variable Years
        Years = Calculation.nextInt();
        //Prompts user to input the month given the range of 1 - 12
        System.out.print("Please Provide the Month(Range: 1 - 12): ");
        //Takes in user input and sets it to variable Months
        Months = Calculation.nextInt();
        //If the Year is less than 1600 or greater than 2600, break and exit
        if(Years < 1600  || Years > 2600){
            System.out.println("You did not state between the values of 1600 or 2600 for Year");
            System.out.println(RED + "Exiting Program...");
            break;
        }else if(Months < 1 || Months > 12){
            System.out.println("You did not state between the values of 1 or 12 for Month");
            System.out.println(RED + "Exiting Program...");
            break;
        }
            switch (Months) {
                //Note: Any year divisible by 4 will result to a leap year and february will have 29 days rather than 28, Except years divisible by 100
                case 1:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 0 ]);
                case 2:
                    //If variable Years is divisible by 4 and 400, then February is 28 days long rather than 29
                    if (((Years % 4) == 0) || ((Years % 400) == 0)) {
                        System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 28", Years, Month[ 1 ]);
                    }
                    //Else if wariable Years is divisible by 100, then February is 29 days long rather than 28
                    else if (Years % 100 == 0) {
                        System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 29", Years, Month[ 1 ]);
                    }
                    break;
                case 3:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 2 ]);
                    break;
                case 4:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 30", Years, Month[ 3 ]);
                    break;
                case 5:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 4 ]);
                    break;
                case 6:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 30", Years, Month[ 5 ]);
                    break;
                case 7:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 6 ]);
                    break;
                case 8:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 7 ]);
                    break;
                case 9:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 30", Years, Month[ 8 ]);
                    break;
                case 10:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 9 ]);
                    break;
                case 11:
                    /*This is for the month of January given any year based on gregorian calender*/
                    //This printf statement prints out how many days the given month will have(1-12) while also being given year based on gregorian calender(1600 - 2600)
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 30", Years, Month[ 10 ]);
                    break;
                case 12:
                    /*This is for the month of January given any year based on gregorian calender*/
                    System.out.printf(WHITE_BOLD + "Year: %d\tMonth: %s\tNumber of Days: 31", Years, Month[ 11 ]);
                    break;
                default:
                    //If user does not input a value ranged from 1 - 12 then run this case and print these statements
                    System.out.println("--There is no possible output for values less than 1 or greater than 12.--");
                    System.out.println("--Please restart the application or quit and rerun the application.--");
            }
            //Brief outro of the application and asking the user if the user would like to continue
            System.out.println();
            System.out.println(RESET + "Would you like to continue with this application?");
            System.out.println("Please input" + GREEN + " Y "  + RESET + " or " + RED + " N " + RESET + "(Not Yes/yes/ye/Ye or No/no/nope/noppie)");
            System.out.print("Your Response: ");
        } while ("Y".equals(YEsNo.next()));//If Y then continue with the do loop
    }
}

