import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        int average = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) average += i;
        }

        System.out.println("The average of numbers exactly divisible by three and four up to the number you entered: " + average);
    }
}