package ss16_IO_file.excercise.copy_file;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException, IOException {
        File fileRead = new File("src\\ss16_IO_file\\excercise\\copy_file\\copyfile.txt");
        if (!fileRead.exists()) {
            System.out.println("File nguồn không tồn tại");
            fileRead.createNewFile();
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileRead);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        File fileWrite = new File("src\\ss16_IO_file\\excercise\\copy_file\\copyfile2.txt");
        if (fileWrite.exists()) {
            System.out.println("File đích đã tồn tại");
        } else {
            fileWrite.createNewFile();
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileWrite);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = line.replaceAll(" ", "");
            count += line.length();
        }
        bufferedReader.close();
        bufferedWriter.close();
        System.out.println("Số kí tự trong chuỗi là: " + count);
    }
}
