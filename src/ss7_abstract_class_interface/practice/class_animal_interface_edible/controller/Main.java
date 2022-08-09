package ss7_abstract_class_interface.practice.class_animal_interface_edible.controller;

import ss7_abstract_class_interface.practice.class_animal_interface_edible.model.Animal;
import ss7_abstract_class_interface.practice.class_animal_interface_edible.model.Chicken;
import ss7_abstract_class_interface.practice.class_animal_interface_edible.model.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for(Animal animal :animals){
            animal.makeSound();
            System.out.println(animal.makeSound());
        }
    }
}
