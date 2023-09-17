//tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
//girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int n;
        do {
            System.out.println("Please enter a number: ");
            n = scan.nextInt();

            if (n % 4 == 0) {
                total += n;
            }
        }
        while (n % 2 == 0);

        System.out.println("SUM --> " + total);
    }
}