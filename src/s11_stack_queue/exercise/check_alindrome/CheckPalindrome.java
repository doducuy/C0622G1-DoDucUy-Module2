package s11_stack_queue.exercise.check_alindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> stringQueue = new LinkedList<>();
        Stack<String> stringStack = new Stack<>();
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stringQueue.add(String.valueOf(str.charAt(i)));
            stringStack.push(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < str.length(); i++) {
            if (!stringStack.pop().equalsIgnoreCase(stringQueue.poll())) {
                System.out.println("is not Palindrome");
                return;
            }
        }
        System.out.println("is Palindrome");
    }
}
