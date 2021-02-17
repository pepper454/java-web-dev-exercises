package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner myinput;

        myinput = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = myinput.nextDouble();
        myinput.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
        int[] myInts = new int[5];
        int[] myInts2 = {0, 1, 2, 3, 4};
        System.out.println("myInts2 3rd item loc 2 = " + myInts2[2]);
        System.out.println("myInts2 5th item loc 4 = " + myInts2[4]);
        System.out.println("myInts2 1st item loc 0 = " + myInts2[0]);
        System.out.println("myInts2 2nd item loc 1 = " + myInts2[1]);
        System.out.println("myInts2 4th item loc 3 = " + myInts2[3]);
        System.out.println(myInts2[3] + myInts2[4]);
        System.out.println(myInts2[4] / myInts2[2]);
    }

}
