package nhap_15_8.ke_thua.thuc_hanh_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    double radius=1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=xxx, which is a subclass of yyy";
    }
}
