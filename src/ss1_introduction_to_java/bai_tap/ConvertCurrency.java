package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Nhập số tiền cần chuyển đổi (USD): ");
        usd = scanner.nextDouble();
        double moneyCovert = usd * vnd;
        System.out.print("Số tiền chuyển đổi là: " + moneyCovert + " VND");

    }
}
