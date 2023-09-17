import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Please enter the length of your array: ");
         int length = scan.nextInt();
         int[] numbers = new int[length];

         for(int i = 0; i<length; i++){
             System.out.println(i+1 + ". element: ");
             numbers[i] = scan.nextInt();
         }

         System.out.println("Your array --> " + Arrays.toString(numbers));
         Arrays.sort(numbers);
         System.out.println("Your array sorted out --> " + Arrays.toString(numbers));
    }
}