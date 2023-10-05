package TH;

public class StudentManager {
    public static void main(String[] args) {
        Student student = new Student("Tùng",25,true);
        Student student1 = new Student();
        student.displayInfo();
        System.out.println(student.toString());
    }
}
