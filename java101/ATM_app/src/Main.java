import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Please enter your username: ");
            userName = scan.nextLine();
            System.out.print("Please enter your password: ");
            password = scan.nextLine();

            if (userName.equals("username") && password.equals("password")) {
                System.out.println("Hello, Welcome to BANK!");
                    System.out.println("""
                            1-Cash Deposit
                            2-Cash Drawing
                            3-Balance Inquiry
                            4-EXIT""");
                    System.out.print("Please select the action you want to take: ");
                    select = scan.nextInt();

                switch (select) {
                    case 1 -> {
                        System.out.print("Amount of money: ");
                        int price = scan.nextInt();
                        balance += price;
                    }
                    case 2 -> {
                        System.out.print("Amount of money: ");
                        int price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    }
                    case 3 -> System.out.println("Balance: " + balance);
                    case 4 -> System.out.println("See you later..");
                    default -> throw new IllegalStateException("Unexpected value: " + select);
                }

            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please contact with the bank.");
                } else {
                    System.out.println("Your remaining number of trials: " + right);
                }
            }
        }
    }
}