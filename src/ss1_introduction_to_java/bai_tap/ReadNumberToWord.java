package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumberToWord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        char numOne = 0;
        char numTwo = 0;
        System.out.print("input number: ");
        num =scanner.nextInt();
        if(num>=20&& num <100){
            String numString = Integer.toString(num);
            numOne= numString.charAt(0);
            numTwo = numString.charAt(1);
        }
        switch (numOne){
            case '2':
                System.out.print("twenty ");
                break;
            case '3':
                System.out.print("thirty ");
                break;
            case '4':
                System.out.print("fourty ");
                break;
            case '5':
                System.out.print("fivety ");
                break;
            case '6':
                System.out.print("sixty ");
                break;
            case '7':
                System.out.print("seventy ");
                break;
            case '8':
                System.out.print("eighty ");
                break;
            case '9':
                System.out.print("ninety ");
                break;
        }
        switch (numTwo){
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.print("two");
                break;
            case '3':
                System.out.print("three");
                break;
            case '4':
                System.out.print("four");
                break;
            case '5':
                System.out.print("five");
                break;
            case '6':
                System.out.print("six");
                break;
            case '7':
                System.out.print("seven");
                break;
            case '8':
                System.out.print("eight");
                break;
            case '9':
                System.out.print("night");
                break;
        }

    }
}
