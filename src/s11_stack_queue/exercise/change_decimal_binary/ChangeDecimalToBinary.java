package s11_stack_queue.exercise.change_decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so muon doi");
        Stack<Integer> integerStack=new Stack<>();
        int number= Integer.parseInt(input.nextLine());
        while(number!=0){
            integerStack.push(number%2);
            number=number/2;
        }
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
