package ss5_access_modifier_static_method_static_property.practice.static_method;

 class Student {
    private int rollno;
    private String name;
    private static String college="KTDN";

    public Student(int r, String n) {
        rollno = r;
        name=n;
    }
    public static void change(){
        college="CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
