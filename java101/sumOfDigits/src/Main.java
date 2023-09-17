// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            System.out.println(digit + ",");
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}