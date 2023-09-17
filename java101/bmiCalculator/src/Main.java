import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's calculate our body mass index!");

        System.out.println("Enter your height in meter: ");
        double height = scan.nextDouble();
        System.out.println("Enter your weight in kilogram: ");
        double weight = scan.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your height: %s meters \nYour weight: %s kilograms \nYour body mass index: %s%n", height, weight, bmi);
    }
}