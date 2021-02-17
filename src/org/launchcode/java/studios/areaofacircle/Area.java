package org.launchcode.java.studios.areaofacircle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String radius1 = input.next();
        while (!isNumeric(radius1) || Double.parseDouble(radius1) < 0){
                radius1 = input.next();
            }

        input.close();
        if (isNumeric(radius1)) {
            if (Double.parseDouble(radius1) >= 0 ) {
                //area1 = Math.PI * Double.parseDouble(radius1) * Double.parseDouble(radius1);
                area1 = Circle.getArea(Double.parseDouble(radius1));
                DecimalFormat df = new DecimalFormat("###.###");
                System.out.println("The area of a circle of radius " + radius1 + " is: " + df.format(area1));
            }else{
                System.out.println("Try again, please enter positive number.");
            }
        }else{
            System.out.println("Try again, please enter number.");
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
