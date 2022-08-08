package ss5_access_modifier_static_method_static_property.practice.candicate;

import java.util.Arrays;
import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong ts: ");
        int n = Integer.parseInt(input.nextLine());
        String ten;
        String namSinh;
        double diemToan;
        double diemVan;
        Candidate[] arr = new Candidate[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ten ts thu " + (i + 1));
            ten = input.nextLine();
            System.out.println("nhap ns ts thu " + (i + 1));
            namSinh = input.nextLine();
            do{
                System.out.println("nhap diem toan ts thu " + (i + 1));
                diemToan = Double.parseDouble(input.nextLine());
                if(diemToan>10) {
                    System.out.println("Diem ban nhap qua lon. Yeu cau nhap lai.");
                }
            }while (diemToan>10);
            System.out.println("nhap diem van ts thu " + (i + 1));
            diemVan = Double.parseDouble(input.nextLine());
            Candidate thiSinh = new Candidate(ten, namSinh, diemToan, diemVan);
            arr[i] = thiSinh;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());//toString có được k cũng được tự hiểu là toString r
        }
        for (int i = 0; i < n; i++) {
            if (arr[i].getTotal() > 15) {
                System.out.println("thi sinh co diem tren 15 la:"+arr[i].getTen() );
                System.out.println("sinh nam: "+arr[i].getNamSinh());
                System.out.println("tong diem la: "+arr[i].getTotal());
            }
        }
    }
}
