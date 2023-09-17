import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float km, amountPerKm, minFee, openingFee, result,price;

        System.out.println("""
                Welcome!
                Please enter the distance the customer wants to travel in kilometers:\s""");

        km = scan.nextFloat();

        System.out.println("Distance that customer wants to go: " + km + " km");

        amountPerKm = 2.20f;
        openingFee = 10.0f;
        price = openingFee + (km * amountPerKm);

        result = (price<20) ? 20 : price ;

        System.out.println("Total price is: " + result + "TL");
    }
}