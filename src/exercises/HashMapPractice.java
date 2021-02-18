package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> studentId = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;

        System.out.println("Enter student ID Number (or Zero(0) to finish):");

        do {
            System.out.print("Student Id: ");
            newStudentId = input.nextInt();

            if (!newStudentId.equals(0)) {
                System.out.print("Student Name: ");
                String newName = input.next();
                studentId.put(newStudentId, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while (newStudentId > 0);

        // Print class roster
        System.out.println("\nClass roster:");
        System.out.println("\n(ID) - (Name)");

        for (Map.Entry<Integer, String> student : studentId.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }


    }



}
