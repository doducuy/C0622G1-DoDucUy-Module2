package nhap.home;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("phuong trinh co dang: ax^2+bx+c=0");
        Scanner input = new Scanner(System.in);
        System.out.print("nhap a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("nhap b:");
        int b = Integer.parseInt(input.nextLine());
        System.out.print("nhap c:");
        int c = Integer.parseInt(input.nextLine());
        Ptbh gptbh = new Ptbh(a, b, c);
        if (gptbh.getDelta() == 0) {
            System.out.println("pt co nghiem kep: " + gptbh.getNghiem1());
        } else if (gptbh.getDelta() > 0) {
            System.out.println("pt co 2 nghiem phan biet:" + "\n"
                    + "x1= " + gptbh.getNghiem1() + "\n"
                    + "x2= " + gptbh.getNghiem2());
        } else {
            System.out.println("pt vo nghiem");
        }
    }
}
