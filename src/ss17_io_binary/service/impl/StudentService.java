package ss17_io_binary.service.impl;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import ss17_io_binary.model.Student;
import ss17_io_binary.service.IStudent;
import ss17_io_binary.service.ulti.NullEx;
import ss17_io_binary.service.ulti.PointEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("hv1", "truong", "19/07", 10.0, "C0622G1"));
        students.add(new Student("hv2", "uy", "19/07", 10.0, "C0622G1"));
        students.add(new Student("hv3", "uy", "19/07", 10.0, "C0622G1"));
    }

    @Override
    public void addStudent() {
        Student student = getInfo();
        students.add(student);
        System.out.println("thêm thành công");
        displayStudent();
    }

    @Override
    public void displayStudent() {
        for (Student i : students) {
            System.out.println(i);
        }
    }

    @Override
    public void delete() {
                students.remove(findId());
            displayStudent();
    }

    public Student getInfo() {
        System.out.println("nhập thông tin học sinh");
        String id;

        while (true) {
            System.out.println("nhập Id");
            id = scanner.nextLine();
            boolean check = true;
            try {
                if (!id.matches("\\D+\\D+\\d+\\d"))
                    throw new PointEx("nhập sai định dạng");
            } catch (PointEx g) {
                System.out.println(g.getMessage());
                check = false;
            }
            try {
                if (id.equals("")) {
                    throw new NullEx("k được để trống id");
                }
            } catch (NullEx e) {
                System.out.println(e.getMessage());
                check = false;
            }
            for (Student i : students) {
                try {
                    if (i.getId().equals(id)) {
                        throw new PointEx("Id này đã có");
                    }

                } catch (PointEx e) {
                    System.out.println(e.getMessage());
                    check = false;
                    break;
                } catch (Exception e) {
                }
            }

            if (check) {
                break;
            }
        }
        String name;
        while (true) {
            boolean check = true;
            System.out.println("nhập tên");
            name = scanner.nextLine();
            try {
                if (name.equals("")) {
                    throw new PointEx("k được để trống tên");
                }


            } catch (PointEx e) {
                check = false;
                System.out.println(e.getMessage());
            }
            if (check) break;
        }


        System.out.println("nhập ngày sinh");
        String dateOfbirth = scanner.nextLine();

        double score;
        while (true) {
            try {
                System.out.println("nhập điểm");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    throw new PointEx("điểm phải nằm tỏng đoạn 0-10");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("k được nhập chữ");
            } catch (PointEx e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập lớp");
        String nameClass = scanner.nextLine();
        Student student = new Student(id, name, dateOfbirth, score, nameClass);
        return student;
    }
    public Student findId(){
            System.out.println("chỉ nên xóa theo ID vì tên có thể trùng nhau");
            System.out.println("nhập ID của học viên muốn xóa");
            String id =scanner.nextLine();
            for(Student student : students){
                if(student.getId().equals(id)) {
                    return student;
                }
            }
            return null;  // a Quang kêu nên trả về null k xài while ở đây
    }
}
