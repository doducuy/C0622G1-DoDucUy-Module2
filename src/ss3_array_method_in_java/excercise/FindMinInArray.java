package ss3_array_method_in_java.excercise;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int [] arr = new int[5];                                        //khai báo mảng nhập bàn phím có độ dài bằng 5
        Scanner input= new Scanner(System.in);                          //khai báo mảng nhập bàn phím có độ dài bằng 5
        for (int i = 0; i < 5; i++) {                                   //khai báo mảng nhập bàn phím có độ dài bằng 5
            System.out.println("Enter element of arr: ");               //khai báo mảng nhập bàn phím có độ dài bằng 5
            arr[i]= input.nextInt();                                    //khai báo mảng nhập bàn phím có độ dài bằng 5
        }
        int min =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min In Array Is: "+min);
    }
}
