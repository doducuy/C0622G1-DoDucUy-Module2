package s11_stack_queue.exercise.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<Character> characterStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        String str =input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                characterStack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if (characterStack.isEmpty()) {
                    System.out.println(false);
                    return ;
                } else characterStack.pop();

            }
        }
        System.out.println(true);
    }
}
