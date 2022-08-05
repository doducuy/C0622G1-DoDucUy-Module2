package ss4_class_object_in_java.practice.ClassRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(input.nextLine());
        int width = Integer.parseInt(input.nextLine());
        ClassRectangle rectangle = new ClassRectangle(length, width);
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());
    }
}



