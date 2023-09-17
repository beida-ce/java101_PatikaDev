import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String word) {
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length()-1; i>=0; i--){
            reverse.append(word.charAt(i));
        }
        if (word.contentEquals(reverse)){
            System.out.println("The word you entered is palindrome.");
            return true;
        }
        else {
            System.out.println("The word you entered is NOT palindrome.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = scan.nextLine();
        System.out.println(isPalindrome(word));
    }
}