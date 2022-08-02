package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayGeometricTypes {
    //    Hiển thị hình chữ nhật
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input height");
//        int height = input.nextInt();
//        System.out.println("input weight");
//        int weight = input.nextInt();
//        for (int i = 1; i <=height ; i++) {
//            for (int j = 1; j <=weight; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    In hình tam giác vuông, có cạnh góc vuông ở botton-left
//    public static void main(String[] args) {
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <5 ; j++) {
//                if(i>=j){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//    In hình tam giác vuông, có cạnh góc vuông ở top-left
    public static void main(String[] args) {
        for (int i = 5; i >0 ; i--) {
            for (int j = 1; j <= 5; j++) {
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
