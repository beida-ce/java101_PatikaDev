import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double edge1, edge2, hypo, area, perimeter;

        System.out.print("Enter the first edge: ");
        edge1 = scan.nextDouble();
        System.out.print("Enter the second edge: ");
        edge2 = scan.nextDouble();

        hypo = Math.sqrt(Math.pow(edge1, 2) + Math.pow(edge2, 2));

        perimeter = edge1 + edge2 + hypo;
        area = (edge1 + edge2) /2;

        System.out.println("Hypotenuse: " + hypo);
        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle:" + perimeter);
    }
}