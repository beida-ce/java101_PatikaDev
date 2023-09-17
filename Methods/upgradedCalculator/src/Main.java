import java.util.Scanner;

//1- Toplama İşlemi
//2- Çıkarma İşlemi
//3- Çarpma İşlemi
//4- Bölme işlemi
//5- Üslü Sayı Hesaplama
//6- Faktoriyel Hesaplama
//7- Mod Alma
//8- Dikdörtgen Alan ve Çevre Hesabı

public class Main {
    static Scanner scan = new Scanner(System.in);
    static void plus(){
        int number, result = 0, i = 1;
        System.out.println("Enter the numbers you want to add. Enter 0 and the process will be started.");
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("SUM: " + result);
    }

    static void minus(){
        System.out.print("How many number will you enter?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result: " + result);
    }

    static void divide(){
        System.out.print("How many number will you enter?: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divisor value cannot be 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result: " + result);
    }
    static void power(){
        System.out.print("Please enter a base value :");
        int base = scan.nextInt();
        System.out.print("Please enter an exponent value:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial(){
        System.out.print("Please enter a number:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mode(){
        System.out.println("Enter the number to take mode: ");
        int number = scan.nextInt();
        System.out.println("Enter the second number to take mode: ");
        int mode = scan.nextInt();

        int result = number % mode;
        System.out.println(number +" % " +mode +"=" + result);

    }
    static void areaOfRectangle(){
        System.out.println("Enter the value of the first edge: ");
        int edge1 = scan.nextInt();
        System.out.println("Enter the value of the second edge: ");
        int edge2 = scan.nextInt();

        int area = edge1 * edge2 ;
        System.out.println("Area of your rectangle: " + area);
        int perimeter = edge1*2 + edge2*2;
        System.out.println("Perimeter of your rectangle: " + perimeter);
    }

    public static void main(String[] args){

        int select;

        do {
            System.out.println("""
                    1- Addition
                    2- Substraction
                    3- Multiplaction
                    4- Division
                    5- Exponent cClculation
                    6- Factorial Calculation
                    7- Mode 
                    8- Rectangle Area and Perimeter Calculation
                    0- EXIT""");
            System.out.print("Please choose an action: ");
            select = scan.nextInt();
            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divide();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mode();
                case 8 -> areaOfRectangle();
                case 0 -> {
                }
                default -> System.out.println("You entered something incorrectly. Please try again");
            }
        } while (select != 0);
    }
}