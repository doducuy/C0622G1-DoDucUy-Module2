package ss6_iheritance.practice.bai_thuc_hanh_he_cac_doi_tuong_hinh_hoc.model;

import ss6_iheritance.practice.bai_thuc_hanh_he_cac_doi_tuong_hinh_hoc.model.Rectangle;

public class Square extends Rectangle {
    public Square(){
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
