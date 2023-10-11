package BT.LopCircleVaLopCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle cylinder = new Cylinder(5.5, "red", 10);
        cylinder.displayData();
    }
}
