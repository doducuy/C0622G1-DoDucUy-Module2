package ss3_array_method_in_java.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTotalDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row of arr(row=col): ");
//        int row = input.nextInt();
        int row = Integer.parseInt(input.nextLine());
        int i,j;
        int total=0;
        int [][]arr = new int[row][row];
        for ( i = 0; i <row ; i++) {
            for (j = 0; j <row ; j++) {
                System.out.println("Enter element ["+i+","+j+"]");
                arr[i][j]= Integer.parseInt(input.nextLine());
                if(i==j){
                    total= total+ arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Total of element in diagonal line is: "+ total);

    }
}
