package BT.Employee;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    private int employeeId;

    private String employeeName;

    private int age;

    private boolean gender;

    private double rate;

    private int salary;

    private static int count = 1;

    public Employee () {
        this.employeeId = count++;
    }

    public Employee(int employeeId, String employeeName, int age, boolean gender, double rate, int salary) {
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public double getRate() {
        return rate;
    }

    public int getSalary() {
        return salary;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int totalSalary () {
        salary = (int)(rate * 1300000);
        return salary;
    }


    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên");
        employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương");
        rate = Double.parseDouble(scanner.nextLine());
    }

    DecimalFormat formatmoney = new DecimalFormat("###,###,###");

    public void displayData() {
        System.out.println(
                "Employee{" +
                        "employeeId=" + employeeId +
                        ", employeeName='" + employeeName + '\'' +
                        ", age=" + age +
                        ", gender=" + (gender ? "Nam" : "Nữ") +
                        ", rate=" + rate +
                        ", salary=" + formatmoney.format(totalSalary()) + "vnđ" +
                        '}'
        );
    }
}
