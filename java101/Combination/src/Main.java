//Kombinasyon formülü
//C(n,r) = n! / (r! * (n-r)!)
import java.util.Scanner;

public class Main {
    public static int factorial(int number) {
        if (number == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int combination(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter n: ");
        int n = scan.nextInt();
        System.out.println("PLease enter r: ");
        int r = scan.nextInt();

        if (n < 0 || r < 0 || n < r) {
            System.out.println("The combination cannot be calculated.");
        } else {
            int response = combination(n, r);
            System.out.println("C(n, r) --> " + "C(" + n + ", " + r + ") --> " + response);
        }
    }
}