// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int year = scan.nextInt();

        switch (year % 12) {
            case 0 -> System.out.println("Monkey");
            case 1 -> System.out.println("Roaster");
            case 2 -> System.out.println("Dog");
            case 3 -> System.out.println("Pig");
            case 4 -> System.out.println("Mouse");
            case 5 -> System.out.println("Ox");
            case 6 -> System.out.println("Tiger");
            case 7 -> System.out.println("Rabbit");
            case 8 -> System.out.println("Dragon");
            case 9 -> System.out.println("Snake");
            case 10 -> System.out.println("Horse");
            case 11 -> System.out.println("Sheep");
            default -> System.out.println("Please try again!");
        }
    }
}