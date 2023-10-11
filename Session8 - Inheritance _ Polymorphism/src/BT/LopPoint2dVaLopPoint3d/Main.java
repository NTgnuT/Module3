package BT.LopPoint2dVaLopPoint3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1.0f, 3.0f);
        System.out.println(point1.toString());

        Point3D point2 = new Point3D(5.0f);
        System.out.println(Arrays.toString(point2.getXYZ()));
    }
}
