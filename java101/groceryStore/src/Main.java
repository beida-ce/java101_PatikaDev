import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Grocery!");
        System.out.println("Below is the price per kilogram of the fruits and vegetables you requested.");
        System.out.println("""
                pear = 2.14;
                apple = 3.67;
                tomatoes = 1.11;
                banana = 0.95;
                eggplant = 5.00;""");

        float pear = 2.14f, apple = 3.67f, tomatoes = 1.11f, banana = 0.95f, eggplant = 5.00f;

        System.out.println("How much pear do u want? ");
        float kgPear = scan.nextFloat();
        System.out.println("How much apple do u want? ");
        float kgApple = scan.nextFloat();
        System.out.println("How much tomatoes do u want? ");
        float kgTomatoes = scan.nextFloat();
        System.out.println("How much banana do u want? ");
        float kgBanana = scan.nextFloat();
        System.out.println("How much eggplant do u want? ");
        float kgEggPlant = scan.nextFloat();

        float price = (pear * kgPear) + (apple * kgApple) + (tomatoes * kgTomatoes) + (banana * kgBanana) + (eggplant * kgEggPlant);

        System.out.println("Kilogram of Pear: " + kgPear + "\n" +
                "Kilogram of Apple: " + kgApple + "\n" + "Kilogram of Tomatoes: " + kgTomatoes + "\n" +
                "Kilogram of Banana: " + kgBanana + "\n" + "Kilogrzam of EggPlant: " + kgEggPlant + "\n" +
                "*******************************" + "\n" +
                "Total Price is: " + price);
    }
}