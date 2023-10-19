package TH.thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn D", 25, "Hà Nội");
        Student student2 = new Student("Nguyễn Văn C", 20, "Nam Định");
        Student student3 = new Student("Nguyễn Văn A", 23, "Thanh Hóa");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println(studentMap);

        for (Map.Entry<Integer, Student> student: studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println(".................Set.............");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student: students) {
            System.out.println(student.toString());
        }
        
    }
}