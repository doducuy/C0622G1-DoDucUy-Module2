package ss6_iheritance.exercise.class_circle_cylinder.controller;

import ss6_iheritance.exercise.class_circle_cylinder.model.Cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder test = new Cylinder(5);
        test.setRadius(5);
        test.getRadius();
        test.setColor("red");
        test.getColor();
        test.getArea();
        System.out.println(test);
    }
}
