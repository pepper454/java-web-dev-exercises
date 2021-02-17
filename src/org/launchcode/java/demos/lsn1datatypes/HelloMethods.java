package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        String lang1;
        Scanner myinput;

        myinput = new Scanner(System.in);

        System.out.println("Enter which language (fr, sp, en) : ");
        lang1 = myinput.next();
        lang1 = lang1.toLowerCase();
        myinput.close();

        String message = Message.getMessage(lang1);
        System.out.println("To You In " + lang1 + " : " + message);

    }

}
