package ss11_stack_queue.practice;

import java.util.Stack;

public class nhap {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        for (int i = 0; i < 5; i++) {
            System.out.println(integerStack.push(i));
        }
        System.out.println(integerStack);
    }
}
