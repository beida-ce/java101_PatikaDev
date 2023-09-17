import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);
        int selected;
        int[] wrongGuess = new int[5];
        boolean isWin = false;

        for (int right = 0; right < 5; right++) {
            System.out.print("Please enter your guess (between 0 and 100) : ");
            selected = scan.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100 !");
                continue;
            }
            if (selected == number) {
                isWin = true;
                System.out.println("Congratulations correct guess! " + "The secret number is : " + number);
                break;
            } else {
                System.out.println("You entered incorrect number!");
                if (selected > number) {
                    System.out.println("Your guess is bigger than the secret number");
                } else {
                    System.out.println("Your guess is smaller than the secret number");
                }
                wrongGuess[right] = selected;
                System.out.println("Remainder right : " + (4 - right));
            }
        }
        if (!isWin) {
            System.out.println("You lost!" + " Your guesses are : " + Arrays.toString(wrongGuess));
            System.out.println("The secret number was : " + number);
        }
    }
}