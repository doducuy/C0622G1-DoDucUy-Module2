package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    private Circle(double r) {
        this.radius = r;
    }

     protected double getRadius() {
        return radius;
    }

     protected double getArea() {
        return radius * radius * Math.PI;
    }
//Muốn đổi giá trị của radius ở class Test thì khai báo phương thức setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
