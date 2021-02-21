package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("yourself");
        student.setGpa(1);
        System.out.println("Name=" + student.getName());
        System.out.println("GPA=" + student.getGpa());
    }

}
