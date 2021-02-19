package exercises;

import java.util.*;
import java.lang.*;

public class CountingCharacters {
    public static void main(String[] args) {

        /*
          String myString = "If the product of two terms is zero then common sense says at least one of the two terms" +
                " has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
              " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
            " it’s pretty straightforward from there.";
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to count characters:");
        String myString = input.nextLine();
        input.close();

        char[] chars = myString.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        //char tempChar = 0;
        //int tempCount;
        for (char c : chars) {
            int tempCount = 0;
            for (char aChar : chars) {
                if (c == aChar) {
                    tempCount += 1;
                }
            }
            //System.out.println("Char:" + chars[i] + " Count:" + tempCount);
            //charCount.put(chars[i], tempCount);
            if (Character.isLetter(c)) {
                charCount.put(c, tempCount);
            }
        }

        for (Map.Entry<Character, Integer> charCountp : charCount.entrySet()) {
            System.out.println(charCountp.getKey() + " - " + charCountp.getValue());
        }
    }
}
