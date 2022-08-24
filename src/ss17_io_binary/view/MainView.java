package ss17_io_binary.view;

import ss17_io_binary.service.impl.StudentService;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainView {
    public static void main(String[] args) {

//        String str = "cais lum ma con cac daou ma may 12/02-9999";
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//        Matcher matcher = pattern.matcher(str);
//        System.out.println(str);
        String text1 = "cais lum ma con cac daou ma may 12/02/9999";
        Pattern pattern = Pattern.compile("\\d{1,2}[/]\\d{1,2}[/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
        while (matcher.find()) {
            System.out.println(text1.substring(matcher.start(), matcher.end()));
        }
    }
}
