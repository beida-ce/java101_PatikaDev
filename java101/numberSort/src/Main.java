import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will you enter? --> ");
        int quantity = scan.nextInt();
        int[] numbers = new int[quantity];

        for (int i = 1; i <= quantity; i++) {
            System.out.print((i + 1) + ". : ");
            numbers[i] = scan.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < quantity; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}
