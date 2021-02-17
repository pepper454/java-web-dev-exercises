package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingMpg {
    public static void main(String[] args) {
        double mpg;

        System.out.println("Let's Calculate your MPG:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles Driven : ");
        String distance1 = input.next();
        System.out.println("Enter Fuel Consumption (in gallons) : ");
        String fuel1 = input.next();
        input.close();

        if (isNumeric(distance1) && isNumeric(fuel1)) {
            if (Double.parseDouble(distance1) >= 0 && Double.parseDouble(fuel1) >= 0) {
                mpg = Double.parseDouble(distance1) / Double.parseDouble(fuel1);
                DecimalFormat df = new DecimalFormat("###.##");
                System.out.println("Your MPG is : " + df.format(mpg));
            }else{
                System.out.println(distance1 + " / " + fuel1 + " Negative numbers do no compute to MPG");
            }
        }else{
            System.out.println(distance1 + " / " + fuel1 + " letters do not compute to MPG.");
        };
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
