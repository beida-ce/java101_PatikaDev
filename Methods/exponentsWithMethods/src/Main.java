import java.util.Scanner;

public class Main {
    static int pow(int a,int b) {
        int result=1;

        if(b==0) {
            return result;
        }else {
            return result * (a * pow(a, --b));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the base value: ");
        int base = scan.nextInt();
        System.out.println("Please enter the exponent value: ");
        int exp = scan.nextInt();

        System.out.println("Result = "+ pow(base, exp));
    }
}