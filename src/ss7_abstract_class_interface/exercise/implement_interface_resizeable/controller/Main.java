package ss7_abstract_class_interface.exercise.implement_interface_resizeable.controller;


import ss7_abstract_class_interface.exercise.implement_interface_resizeable.model.Circle;
import ss7_abstract_class_interface.exercise.implement_interface_resizeable.model.Rectangle;
import ss7_abstract_class_interface.exercise.implement_interface_resizeable.model.Shape;
import ss7_abstract_class_interface.exercise.implement_interface_resizeable.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(10);
        for (Shape shape : shapes) {
            shape.resize(5);
        }
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
