package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFirstTwentyPrime {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("nhập số số nguyên tố muốn in ra");
        int n =input.nextInt();
        int count = 0;
        int num=2;
        while(count<n){
            int countTwo=0;
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    countTwo++;
                }
            }
            if(countTwo==0){
                System.out.println(num);
                count++;
            }
            num++;
//            hiển thị số nhỏ hơn 100 thì cho 3 dòng ghi chú ở dưới chạy
//            if(num>100){
//                break;
//            }
        }
    }
}
