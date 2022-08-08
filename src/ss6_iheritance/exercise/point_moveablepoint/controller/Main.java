package ss6_iheritance.exercise.point_moveablepoint.controller;

import ss6_iheritance.exercise.point_moveablepoint.model.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint test = new MoveablePoint(1,1,5,5);
        System.out.println(test);
        System.out.println(test.move());
    }
}
