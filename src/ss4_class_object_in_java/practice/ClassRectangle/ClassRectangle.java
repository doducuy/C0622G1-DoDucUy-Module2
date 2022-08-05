package ss4_class_object_in_java.practice.ClassRectangle;

public class ClassRectangle {
    int length;
    int width;

    public ClassRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (width + length) * 2;
    }
}

