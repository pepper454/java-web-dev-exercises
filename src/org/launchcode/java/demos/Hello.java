package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Test, Test2");
        String str = "Rutabaga";
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2 = str.toLowerCase();
        System.out.println("String in str2" + " = " + str2);
        System.out.println(str.equals("rutabaga"));
        System.out.println(str.equals("Rutabaga"));
        int someInteger = 5;
        Integer someIntegerObject = Integer.valueOf(someInteger);
        System.out.println(someIntegerObject);
        Integer randomNumber = 565676;
        int randomInt = (int) randomNumber;
        int sum = randomNumber + someInteger;
        System.out.println("The Addition = " + sum);

    }
}