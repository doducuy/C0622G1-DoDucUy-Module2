package ss6_iheritance.practice.bai_thuc_hanh_he_cac_doi_tuong_hinh_hoc.controller;

import ss6_iheritance.practice.bai_thuc_hanh_he_cac_doi_tuong_hinh_hoc.model.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
