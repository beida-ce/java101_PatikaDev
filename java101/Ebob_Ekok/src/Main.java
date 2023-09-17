import java.util.Scanner;

public class Main {
    public static int findEBOB(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        return number1;
    }
    public static int findEKOK(int number1, int number2) {
        return ((number1 * number2) / findEBOB (number1, number2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scan.nextInt();

        int ebob = findEBOB(number1, number2);
        int ekok = findEKOK(number1, number2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}