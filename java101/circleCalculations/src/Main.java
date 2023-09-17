import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        float radius = scan.nextFloat();

        double area, perimeter, sliceArea, angle;
        final double pi = 3.14;

        area = pi* Math.pow(radius, 2);
        perimeter = 2 * pi * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        System.out.println("Enter the central angle: ");
        angle = scan.nextDouble();

        sliceArea = (pi * Math.pow(radius, 2)) * angle / 360;
        System.out.println("Area of the slice: " + sliceArea);
    }
}