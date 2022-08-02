package ss3_array_method_in_java.practice;

import java.util.Scanner;

public class SearchValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name that you want to search");
        String name = input.nextLine();
        int count = 0;
        int index=0;
        for (int i = 0; i < students.length; i++) {

            if (name.equals(students[i])) {
                count++;
                index = i;
            }
        }
        if (count > 0) {
            System.out.println("Position of the students in the list " + name + " is " + index);
        } else {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}

