import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scan.nextInt();

        System.out.println("""
                Operations available on the calculator
                --------------------------
                Addition (+): 1
                Subtraction (-): 2
                Multiplication (*): 3
                Division (/): 4"""
        );

        System.out.println("Please enter your selection: ");
        int selection = scan.nextInt();

        switch(selection){
            case 1:
                System.out.println("Summation: " + (number1 + number2));
                break;

            case 2:
                System.out.println("Subtraction: " + (number1 - number2));
                break;

            case 3:
                System.out.println("Multiplaction: " + (number1 * number2));
                break;

            case 4:
                if (number2 != 0)
                    System.out.println("Division: " + (number1 / number2));
                else
                    System.out.println("You cannot divide any number into zero!");
                break;

            default:
                System.out.println("You entered incorrectly");
        }
    }
}