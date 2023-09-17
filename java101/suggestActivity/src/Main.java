import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the degree of weather: ");
        int degree;
        degree = scan.nextInt();

        if(degree<=25){
            if(degree<5){
                System.out.println("You can ski ");
            }
            if(degree>=10){
                System.out.println("You can go picnic maybe with your family :))");
            }
            if (degree<=15){
                System.out.println("You can go cinema maybe with your friends ;)");
            }
        } else {
            System.out.println("You can swim");
        }
    }
}