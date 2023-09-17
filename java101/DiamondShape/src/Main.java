import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please neter the height of the diamond shape (must be an odd number): ");
        int height = scan.nextInt();

        // upper half
        for (int i = 1; i <= height; i += 2) {
            for (int j = 0; j < (height - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = height - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (height - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}