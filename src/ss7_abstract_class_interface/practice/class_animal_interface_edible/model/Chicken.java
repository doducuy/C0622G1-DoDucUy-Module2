package ss7_abstract_class_interface.practice.class_animal_interface_edible.model;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
