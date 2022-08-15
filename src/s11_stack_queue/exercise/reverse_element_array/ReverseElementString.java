package s11_stack_queue.exercise.reverse_element_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stringStack = new Stack<>();
        System.out.println("nhap chuoi can dao nguoc:");
        String str="";
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            stringStack.push(String.valueOf(string.charAt(i)));
        }
        for (int i = 0; i <string.length() ; i++) {
            str+=stringStack.pop();
        }
        System.out.println(str);
    }
}

