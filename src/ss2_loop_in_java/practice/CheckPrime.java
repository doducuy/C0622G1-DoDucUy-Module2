package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number");
        int num = scanner.nextInt();
        int count = 0;
        if(num<2){
            System.out.println(num+ " Not a Prime");
        }
        else {
            for (int i = 2; i <num ; i++) {
                if(num%i==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println(num+ " is not Prime");
            }
            else{
                System.out.println(num+ " is Prime");
            }
        }
    }
}
