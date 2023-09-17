import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0 ;

        System.out.println("PLease enter a number: ");
        int number = scan.nextInt();

        for(int i=1; i<number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if (sum == number){
            System.out.println( number + " is a perfect number");
        } else{
            System.out.println( number + " is not a perfect number");
        }
    }
}