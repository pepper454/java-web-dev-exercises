package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args){

        int[] myArr = {1, 1, 2, 3, 5, 8};
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String oddNumbers = "";

        //print all
        System.out.println("Print All Numbers:");
        for (int i : myArr){
            //System.out.println(i);
        }
        System.out.println(Arrays.toString(myArr));

        //print odd
        System.out.println("Print Odd Numbers:");
        for (int i : myArr){
            if ((i & 1) == 1){
                //System.out.println(i);
                oddNumbers = oddNumbers + i  + ", ";
            }
        }
        oddNumbers = "["+ oddNumbers.substring(0, oddNumbers.length()-2) + "]";
        System.out.println(oddNumbers);

        //place each word in an array
        String[] myWords = myString.split(" ");
        String myWord = "";
        for (int i = 0; i < Arrays.stream(myWords).count(); i++){
            myWord = myWords[i];
            myWord = myWord.replace(".","");
            myWord = myWord.replace(",","");
            myWords[i] = myWord;
        }

        //output the eachword array
        System.out.println("Each Word:");
        System.out.println(Arrays.toString(myWords));

        //place each sentence in an array
        String[] mySentences = myString.split("\\. ");

        //output the sentences
        System.out.println("Each Sentence:");
        for (int i = 0; i < Arrays.stream(mySentences).count() - 1; i++){
            mySentences[i] = mySentences[i] + ".";
        }
        System.out.println(Arrays.toString(mySentences));
    }
}
