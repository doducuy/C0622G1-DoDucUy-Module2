package ss5_access_modifier_static_method_static_property.practice.static_method;

import java.util.Scanner;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1, "danh");
        Student student2 = new Student(2, "uy");
        Student student3 = new Student(3, "huy");
        Student.change();
        student1.display();
        student2.display();
        student3.display();

        boolean[] booleans = {false,true,false,false};
        System.out.println(booleans[0]);
        for (boolean item: booleans
             ) {
            System.out.println(item);
        }
    }
}
