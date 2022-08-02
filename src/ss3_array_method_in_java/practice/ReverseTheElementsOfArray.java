package ss3_array_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheElementsOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ " + i + " của mảng");
            arr[i] = input.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temporary;
            temporary = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temporary;
        }
        System.out.println(Arrays.toString(arr));
    }
}
