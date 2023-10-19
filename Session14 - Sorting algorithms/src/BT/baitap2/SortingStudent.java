package BT.baitap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingStudent {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5, "A", 5.6));
        students.add(new Student(3, "D", 8.0));
        students.add(new Student(4, "B", 6.7));
        students.add(new Student(1, "E", 9.5));
        students.add(new Student(2, "C", 7.6));
        System.out.println(students);


//        insertionSort(students);
//        System.out.println(students);

//        selectionSort(students);
//        System.out.println(students);

        bubbleSort(students);
        System.out.println(students);

    }

    public static void insertionSort(List<Student> students) {
        for (int i = 1; i < students.size() ; i++) {
            Student e = students.get(i);
            int j;
            for ( j = i - 1; j >= 0 && students.get(j).getStudentId() < e.getStudentId() ; j--) {
                students.set(j+1,students.get(j));
            }
            students.set(j+1, e);
        }
    }

    public static void selectionSort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            Student min = students.get(i);
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (min.getName().compareTo(students.get(j).getName()) > 0) {
                    min = students.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students.get(i);
                students.set(i,min);
                students.set(minIndex, temp);
            }
        }
    }

    public static void bubbleSort(List<Student> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 ; j++) {
                if (students.get(j).getScore() < students.get(j+1).getScore()) {
                    Student temp = students.get(j);
//                    students.get(j) = students.get(j+1);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }
        }
    }


}
