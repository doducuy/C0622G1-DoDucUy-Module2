package ss5_access_modifier_static_method_static_property.practice.static_property;

class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String a, String b){
        this.name=a;
        this.engine=b;
        numberOfCars++;
    }
//    public String toString() {
//        return "Car "+numberOfCars+':' + " name='" + name + '\'' + ", engine='" + engine + '\'' + '!';
//    }
}
