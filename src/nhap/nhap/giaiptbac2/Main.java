package nhap.nhap.giaiptbac2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("pt bac 2 co dang: ax^2 + bx + c = 0");
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double b = Double.parseDouble(input.nextLine());
        double c = Double.parseDouble(input.nextLine());
        giaipt nghiem =new giaipt( a, b,c);
        System.out.println(nghiem.getSolution());
    }
}
