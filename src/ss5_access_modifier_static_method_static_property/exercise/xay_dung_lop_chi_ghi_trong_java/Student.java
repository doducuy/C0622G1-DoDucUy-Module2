package ss5_access_modifier_static_method_static_property.exercise.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name="John";
    private String classes="C02";

    public Student() {
    }

    protected String setName(String name) {
        this.name = name;
        return name;
    }
     String setClasses(String classes){
        this.classes= classes;
        return classes;
    }
}
