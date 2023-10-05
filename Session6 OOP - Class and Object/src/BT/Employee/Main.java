package BT.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee [2];

        System.out.println("Nhập thông tin cho danh sách.");
        for (int i = 0; i < employees.length; i++) {
            Employee employee = new Employee();
            employee.inputData();
            employees[i] = employee;
        }

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayData();
        }
    }
}
