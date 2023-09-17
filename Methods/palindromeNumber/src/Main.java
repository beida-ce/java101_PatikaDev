import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is palindrome: ");
        int testNumber = scan.nextInt();

        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome number.");
        } else {
            System.out.println(testNumber + " is not a palindrome number.");
        }
    }
}
