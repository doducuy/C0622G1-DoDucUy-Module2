package ss5_access_modifier_static_method_static_property.practice.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
//        Car car1 = new Car("Mec", "5cc");
//        System.out.println(car1.toString());
//
//        Car car2 = new Car("Mad", "10cc");
//        System.out.println(car2.toString());
//
//        Car car3 = new Car("Mik", "15cc");
//        System.out.println(car3.toString());

        Car car1 = new Car("Mazda 3", "Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");

        System.out.println(Car.numberOfCars);
    }
}
