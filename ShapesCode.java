package com.company;

public class ShapesCode {
    public static void main(String[] args){

        //Prints out the string that contains all of the values for each
        System.out.println("\tCube\t\t\t\tRectangular Prism\t\tTetrahedron\t\t\tSphere");

        //This line of code is used for the Lenght Volume and Surface Area results which is given within the for loop
        System.out.println("Length\tVolume\tSurface Area\tLength\tVolume\tSurface Area\tLength\tVolume\tSurface Area\tRadius\tVolume\tSurface Area");

        //This for loop is to iterate the arrays and print out the value upto 10
        for (int i = 1; i <= 10; i++){
            //Declaration of variables used for the SA and Volume formulas
            int Lenght = i, Witdh = 5, Height = 6;

            //This array contains the Volume calculations for each shape using variables lited above^
            double[] VolumeCalculations = {
                    Lenght * Lenght * Lenght, // Cube Volume
                    Lenght * Witdh * Height,  // Rectangular Prism Volume
                    Lenght * Lenght * Lenght / (6* Math.sqrt(2)), //Tetrahedron Volume
                    4 * Math.PI * Lenght * Lenght * Lenght / 3 //Sphere Volume
            };

            //This array contains the SA calculations and formulas for each shape using the variables listed above the array^
            double[] SurfaceAreaCalc = {
                    Lenght * Lenght * 6, // Cube SA
                    (2 * Height * Witdh) + (2 * Height * Witdh), //Rectangular Prism SA
                    Lenght * Lenght * Math.sqrt(3), //Tetrahedron SA
                    4 * Math.PI * Lenght * Lenght //Sphere SA/Radius
            };

            //For loop to iterate 4 times to print out the result from the calculations for Volume and SA
            for( int j = 0; j < 4 ; j++){
                System.out.printf("%d\t%.1f\t%.1f\t\t " ,Lenght ,VolumeCalculations[j], SurfaceAreaCalc[j]);
            }
            //This line of code is for decorative functions only
            System.out.println(")<>(");
        }
    }
}

