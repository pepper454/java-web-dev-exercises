package exercises;

import java.util.Scanner;

public class AliceExtended {
    public static void main(String[] args) {
        String text1 =  "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please enter search phrase:");
        Scanner input = new Scanner(System.in);
        String search1 = input.nextLine();
        input.close();

        String text2 = text1.toLowerCase();
        String search2 = search1.toLowerCase();

        if (text2.contains(search2)) {
            System.out.println("Your Search Term *" + search1 + "* of length " + search2.length() + " was found at index " + text2.indexOf(search2));
            System.out.println("New text with Search Term Removed : ");
            String textOut = text1.replaceAll(search1, "");
            textOut = textOut.replaceAll(search1.toLowerCase(), "");
            textOut = textOut.replaceAll(capitalize(search1), "");
            System.out.println(textOut);

        } else {
            System.out.println("Your Search Term *" + search1 + "* was NOT found");
        }
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
