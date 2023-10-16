package TH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class thuchanh1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "xuan", 25, true ));
        list.add(new Student(2, "ha", 25, true ));
        list.add(new Student(3, "thu", 25, true ));

        Student student = new Student();

        student.inputData();
        list.add(student);
        System.out.println(list);

        // Comparable
        Collections.sort(list);
        System.err.println("Danh sách sắp xếp bằng comparable.");
        System.out.println(list);

        // Comperator
        StudentComparator student2 = new StudentComparator();
        Collections.sort(list, student2);
        System.err.println("Danh sách sắp xếp bằng comparator.");
        System.out.println(list);
    }
}
