package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

import ss6_iheritance.practice.bai_thuc_hanh_he_cac_doi_tuong_hinh_hoc.model.Shape;

public class Circle extends Shape {
    private double radius = 1;
//    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
