import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isError = false;
        double fee, km, finalPrice = 0;
        double feePerKm = 0.90;

        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        if (age < 0)
            isError = true;

        System.out.println("Please enter your ticket type --> One Way ticket (1)" + "\n" +
                            "                              --> Return Ticket (2)");
        int ticketType = scan.nextInt();
        if (ticketType!=1 && ticketType!=2)
            isError = true;

        System.out.println("Please enter your distance in kilometers: ");
        km = scan.nextInt();
        if (km < 0)
            isError = true;

        fee = km * feePerKm;

        if (ticketType == 2){
            fee -= (fee/5);
            finalPrice = fee;
        }

        if (age > 0 && age < 12){
            fee -= (fee / 2);
            finalPrice = fee;
        } else if (age >= 12 && age <= 24) {
            fee -= (fee / 10);
            finalPrice = fee;
        } else if (age >= 65) {
            fee -= ((3 * fee) / 10);
            finalPrice = fee;
        }


        if (isError)
            System.out.println("You entered something incorrectly!");
        else
            System.out.println("\n" + "TICKET INFORMATION" + "\n" +
                                "*********************************"  + "\n" +
                                "Name: " + name + "\n" +
                                "Age: " + age + "\n" +
                                "The amount you have to pay: " + finalPrice + "tl" );
    }
}