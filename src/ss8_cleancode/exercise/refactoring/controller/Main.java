package ss8_cleancode.exercise.refactoring.controller;

import ss8_cleancode.exercise.refactoring.model.TennisGame;

public class Main {
    public static void main(String[] args) {
        TennisGame.showNamePlayer("Hai", "Quang");
        System.out.print("Result: ");
        System.out.print(TennisGame.getScore(3,3));
    }
}
