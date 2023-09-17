import java.util.Scanner;

public class Main {
    static int fibonacci(int number){
        if(number == 1 || number ==2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number sequence that you want to know --> ");
        int number = scan.nextInt();

        System.out.println("Number in the "+number+". row --> "+ fibonacci(number));
    }
}