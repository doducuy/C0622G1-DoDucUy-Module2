package ss17_io_binary.excercise.copy_file.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainController {
    public static void main(String[] args) {
        final String SourceFile = "src\\ss17_io_binary\\excercise\\copy_file\\controller\\hihi.txt";
        final String TargetFile = "src\\ss17_io_binary\\excercise\\copy_file\\controller\\hihi.txt";
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(SourceFile);
            fileOutputStream = new FileOutputStream(TargetFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, length);
            }
            System.out.println("Số byte trong tệp: " + fileOutputStream.getChannel().size());
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
