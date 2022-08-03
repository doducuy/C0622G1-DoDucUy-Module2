package ss3_array_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInTwoWayArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number row: ");
        int n= input.nextInt();
        System.out.println("Enter number col: ");
        int m= input.nextInt();
        int[][] arr = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int max = arr[0][0];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Max in array is: " + max);
    }
}

