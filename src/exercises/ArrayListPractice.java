package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        String wordList = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        for (int i = 0; i < 5; i++) {
            myNumbers.add(12);
            myNumbers.add(1);
        }
        //System.out.println(myNumbers);
        Integer outputEven = sumEven(myNumbers);
        System.out.println("1. Sum of Even Numbers: " + outputEven);

        //create list from words string
        ArrayList<String> myWords2 = new ArrayList<>();
        String[] myWords = wordList.split(" ");
        //String myWord = "";
        for (int i = 0; i < Arrays.stream(myWords).count(); i++){
            String myWord = myWords[i];
            myWord = myWord.replace(".","");
            myWord = myWord.replace(",","");
            myWords[i] = myWord;
            myWords2.add(myWord);
        }
        //System.out.println(myWords2.toString());
        System.out.println("How Many letters are we looking for?:");
        Scanner input = new Scanner(System.in);
        Integer letters = input.nextInt();
        input.close();
        System.out.println("1. Words with " + letters + " letters: ");
        System.out.println(findWords(myWords2, letters));
    }

    //Find and sub all even numbers
    public static Integer sumEven(ArrayList<Integer> inArr) {
        int sum1 = 0;
        for (Object o : inArr) {
            Integer isCheck = (Integer) o;
            if ((isCheck & 1) != 1) {
                sum1 += isCheck;
            }
        }
        return sum1;
    }

    //print each word that has X letters
    public static String findWords(ArrayList<String> inArr, Integer numberLetters) {
        for (Object o : inArr) {
            String isCheck = (String) o;
            if (isCheck.length() == numberLetters){
                System.out.println(isCheck);
            }

        }

    return "";

    }


}