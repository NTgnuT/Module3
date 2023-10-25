package ra.data.modals;

import java.io.Serializable;

public class Student implements Serializable {
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
