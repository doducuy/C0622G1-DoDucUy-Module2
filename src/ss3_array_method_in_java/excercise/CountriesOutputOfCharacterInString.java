package ss3_array_method_in_java.excercise;

import java.util.Scanner;

public class CountriesOutputOfCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String str = "aaabbbbcccdddd";
        String charOne = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (charOne.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
