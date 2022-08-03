package ss3_array_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

class CalculateTotalInOfColArrayTwoWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row of array: " );
        int n = input.nextInt();
        System.out.println("Enter col of array: " );
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        int i,j;
        for (i = 0; i < n; i++) {
            for ( j = 0; j <m ; j++) {
                System.out.println("Enter element ["+i+","+j+"]");
                arr[i][j]= Integer.parseInt(input.nextLine());
            }

        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter number col that you want to total:");
//        int count = input.nextInt();
        int count = Integer.parseInt(input.nextLine());
        int total=0 ;
        for (i = 0;i  < n; i++) {
            for (j = 0; j < m; j++) {
                if(j==(count-1)){
                    total=total+arr[i][j];
                }
            }
        }
        System.out.println("Total is: " +total);
    }
}
