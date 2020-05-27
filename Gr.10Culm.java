import java.io.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Arrays;

import static java.lang.Double.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Declaration of the 4 arrays for the data
        String[] AccField , BalanceField = new String[40], PurchaseField , PaymentField;

        File file = new File("C:\\Users\\Bilal-DellPC\\Downloads\\Ledger.Dat");

        //this will have a wait time for the files contents and is returning back data from fr
        BufferedReader ReadLines = new BufferedReader(new FileReader(file));
        /*
            This is going to be the string where the data from the file is going to be stored,
            The array lines is going to take in the data from BalanceFeild, AccFeild, PurchseFeild, and
            PaymentFeild. Printing it out in a print f statement from each position within the code.
        */
        ArrayList<String[]> lines = new ArrayList<>();

        try {
            /*
              within the try block String line2 reads the values from within Readlines and checks if it is not null,
              if it is not null then the for loop continues and sets the value of Readlines to line2
            */
            for (String line2 = ReadLines.readLine(); line2 != null; line2 = ReadLines.readLine()) {
                /*
                  This line of code takes the String[] AccField and sets it values as the values from line2.
                  Then it takes that value from line2 and uses the split method inorder to remove spaces that would
                  normally count as elements and to make it efficiently run code from a certain column and row.
                */
                AccField = line2.split(" ");
                lines.add(AccField);

                /*
                  This line of code takes the String[] BalanceField and sets it values as the values from line2.
                  Then it takes that value from line2 and uses the split method inorder to remove spaces that would
                  normally count as elements and to make it efficiently run code from a certain column and row. Another thing to
                  add is that it has more spaces than just one space for the split method. since there are 4 spaces within the DAT file,
                  the {3} within the split represents the space 0 1 2 3 that need to be removed.
                */
                BalanceField = line2.split(" {3}");
                lines.add(BalanceField);

                //Top comment applies to String[] PurchaseField aswell
                PurchaseField = line2.split(" {3}");
                lines.add(PurchaseField);

                //Top comment applies to String[] PaymentField aswell
                PaymentField = line2.split(" {3}");
                lines.add(PaymentField);

                /*
                  This printf statement prints out the values from AccField[0], BalanceField[1], PurchaseField[2], and PaymentField[3].
                  Notice how all of the String[] arrays have a different set point ranging from 0 1 2 3. This ensures that the set point,
                  prints out the certain data from that certain row or column within the DAT file.
               */
                System.out.printf("%s \t %s \t %s \t %s", AccField[ 0 ], BalanceField[ 1 ], PurchaseField[ 2 ], PaymentField[ 3 ]);
                System.out.println();

                for (int i = 0; i > 30; i++) {
                    AccField = line2.split(" ");
                    lines.add(AccField);

                    BalanceField = line2.split(" {3}");
                    lines.add(BalanceField);

                    PurchaseField = line2.split(" {3}");
                    lines.add(PurchaseField);


                    String pos = Arrays.toString(new String[]{Arrays.toString(new String[]{BalanceField[ 2 ]})});
                    double data = parseDouble(String.valueOf(pos.length()));


                    String pos2 = Arrays.toString(new String[]{Arrays.toString(PurchaseField[ 3 ].split("B", 5))});
                    double data2 = parseDouble(String.valueOf(pos2.length()));

                    double FinalInterest = data * 0.233333333;
                    double Interestbalance = data + FinalInterest;
                    var Payment = Interestbalance + data2;
                    var finalresult = Payment - data2;

                    System.out.printf("%d \t %s \t\t %.2f", i + 1, AccField[ 0 ], finalresult);
                    System.out.println();
                    break;
                }
            }

            //This line catches the Exception if there is one and prints it out
        } catch(IOException e) {
            //This will print out an IOException if the error has not been handled
            System.out.println(e.toString());
        }

        //Labels for the formula calculations and the account numbers
        System.out.println("\tAccount Name\tResult");
    }
}