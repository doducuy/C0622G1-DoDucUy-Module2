package ss17_io_binary.model;

public class Student extends Person{
    private Double score;
    private String nameClass;

    public Student() {
    }

    public Student(Double score, String nameClass) {
        this.score = score;
        this.nameClass = nameClass;
    }

    public Student(String id, String name, String dateOfBirth, Double score, String nameClass) {
        super(id, name, dateOfBirth);
        this.score = score;
        this.nameClass = nameClass;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", nameClass='" + nameClass + '\'' +
                '}'+super.toString();
    }
}
