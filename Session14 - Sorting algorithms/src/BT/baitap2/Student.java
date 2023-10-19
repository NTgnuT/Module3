package BT.baitap2;

public class Student {
    private int studentId;

    private String name;

    private double Score;

    public Student() {
    }

    public Student(int studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        Score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", Score=" + Score +
                '}'+ "\n";
    }
}
