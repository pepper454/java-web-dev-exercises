package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String text1 =  "Alice was beginning to get very tired of sitting by her sister on the " +
                        "bank, and of having nothing to do: once or twice she had peeped into the " +
                        "book her sister was reading, but it had no pictures or conversations in " +
                        "it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Please enter search term:");
        Scanner input = new Scanner(System.in);
        String search1 = input.nextLine();
        input.close();
        if (text1.toLowerCase().contains(search1.toLowerCase())) {
            System.out.println("Your Search Term *" + search1 + "* was found");
        } else {
            System.out.println("Your Search Term *" + search1 + "* was NOT found");
        }
        }
}
