package exercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double area1;

        System.out.println("Let's Calculate the area of a rectangle:");
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle length : ");
        String length1 = input.next();
        System.out.println("Rectangle width : ");
        String width1 = input.next();
        input.close();

        if (isNumeric(width1) && isNumeric(length1)) {
            if (Double.parseDouble(width1) >= 0 && Double.parseDouble(length1) >= 0) {
                area1 = Double.parseDouble(width1) * Double.parseDouble(length1);
                DecimalFormat df = new DecimalFormat("###.##");
                System.out.println("Rectangle Area : " + df.format(area1));
            }else{
                System.out.println(length1 + " * " + width1 + " Negative numbers do no compute to area");
            }
        }else{
            System.out.println(length1 + " * " + width1 + " letters do not compute to area.");
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
