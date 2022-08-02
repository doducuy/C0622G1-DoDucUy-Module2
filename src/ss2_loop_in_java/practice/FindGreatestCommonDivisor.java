package ss2_loop_in_java.practice;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = input.nextInt();
        System.out.println("Enter second number");
        int secondNum = input.nextInt();
        firstNum = Math.abs(firstNum);
        secondNum = Math.abs(secondNum);
        if (firstNum == 0 || secondNum == 0) {
            System.out.println("No greatest common factor");
        }
        while (firstNum != secondNum) {
            if (firstNum > secondNum)
                firstNum = firstNum - secondNum;
            else
                secondNum = secondNum - firstNum;
        }
        System.out.println("Greatest common factor: " + firstNum);


    }
}
