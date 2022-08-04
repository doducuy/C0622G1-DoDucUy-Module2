package ss4_class_object_in_java.practice.ClassRectangle;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chieuDai = Integer.parseInt(scanner.nextLine());
        int chieuRong = Integer.parseInt(scanner.nextLine());

        ClassRectangle rectangle1 = new ClassRectangle(chieuDai,chieuRong);
        System.out.println(rectangle1.getChieuDai());
        System.out.println(rectangle1.getChieuRong());
        System.out.println(rectangle1.getDienTich());
        System.out.println(rectangle1.getChuVi());
    rectangle1.setChuVi(10);
        System.out.println(rectangle1.getChuVi());
    }
}

