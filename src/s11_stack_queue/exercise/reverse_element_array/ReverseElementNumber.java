package s11_stack_queue.exercise.reverse_element_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Nhap so phan tu cua mang");
        int n = Integer.parseInt(input.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu: " + (i + 1));
            arr[i] = Integer.parseInt(input.nextLine());
            integerStack.push(arr[i]);
        }
        System.out.println(integerStack);
        for (int i = 0; i < n; i++) {
            arr[i] = integerStack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
