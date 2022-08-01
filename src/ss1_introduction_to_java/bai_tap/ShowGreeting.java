package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("input name: ");
        name = scanner.next();
        System.out.printf("Hello %s", name);
    }
}
