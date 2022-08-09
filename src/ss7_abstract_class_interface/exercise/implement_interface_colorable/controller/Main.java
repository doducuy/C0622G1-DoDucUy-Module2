package ss7_abstract_class_interface.exercise.implement_interface_colorable.controller;

import ss7_abstract_class_interface.exercise.implement_interface_colorable.model.Circle;
import ss7_abstract_class_interface.exercise.implement_interface_colorable.model.Rectangle;
import ss7_abstract_class_interface.exercise.implement_interface_colorable.model.Shape;
import ss7_abstract_class_interface.exercise.implement_interface_colorable.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(3,4);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
                System.out.println();
            }
            System.out.println();
        }
    }
}
