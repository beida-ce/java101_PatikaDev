//Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        for (int k = 1; k<number; k++){
            if((Math.pow(4,k) <= number) || (Math.pow(5,k) <= number))
            {
                System.out.println("4^" + k + "=" + Math.pow(4, k));
                System.out.println("5^" + k + "=" + Math.pow(5, k));
            }
        }
    }
}