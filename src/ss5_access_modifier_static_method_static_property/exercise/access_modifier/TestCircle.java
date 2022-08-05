package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Circle circle= new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        double radius= Double.parseDouble(input.nextLine());

        circle.setRadius(radius);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

    }
}
