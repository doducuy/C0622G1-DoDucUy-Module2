package ss15_exception.teacher_student.service.untils;

import ss15_exception.teacher_student.model.Student;

import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public void writeStudentFile(String path, List<Student> studentList) throws IOException {
        String data = "id,name,dateOfBirth,gender,score,className\n";

        for (Student student : studentList) {
            data += student.toString() + "\n";
        }

        WriteFileUtil.writeFile(path, data);
    }
}
