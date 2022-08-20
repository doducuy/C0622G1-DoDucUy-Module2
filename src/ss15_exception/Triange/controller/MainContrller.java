package ss15_exception.Triange.controller;

import ss15_exception.Triange.service.ITriangle;
import ss15_exception.Triange.service.impl.ITriangleService;

import java.util.Scanner;

public class MainContrller {
    ITriangleService iTriangle = new ITriangleService();
    Scanner scanner = new Scanner(System.in);


    public void menuUUU() {

        while (true){
            System.out.println("chon chuc nang");
            System.out.println("1.Them cac anh" + "\n" + "2.Hien thi tam giac" + "\n" + "3.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTriangle.addABC();
                    break;
                case 2:
                    iTriangle.displayABC();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhap 1-3 thoy");
            }
        }

    }
}
