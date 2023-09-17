import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name, userName, password;
        System.out.println("""
                Do you want to log in or sign up?
                If you want to sign up please enter 1
                If you want to login please enter 2""");

        int selection = scan.nextInt();

        switch(selection){
            case 1:
                System.out.println("Let's sign up!" + "\n" +"Please enter your name: ");
                name = scan.nextLine();
                scan.nextLine();
                System.out.print("Please create your username: ");
                userName = scan.nextLine();
                System.out.print("Please create your password: ");
                password = scan.nextLine();
                System.out.println("Name: " + name + "\n" + "username: " + userName + "\n" +
                        "password: " + password);
                System.out.println("You created a new account, welcome!");

            case 2:
                System.out.println("Please enter your username: ");
                userName = scan.next();
                System.out.println("Please enter your password: ");
                password = scan.next();

                if (userName.equals("username") && password.equals("password")) {
                    System.out.println("You have successfully logged in");
                }
                else {
                    System.out.println("Wrong username or password. Do you want to reset your password? : (yes / no)");
                    String answer = scan.next();
                    if (answer.equals("yes")) {
                        System.out.println("Please enter your new password: ");
                        password = scan.next();
                        if (password.equals("password"))
                            System.out.println("Your new password same as old password!");
                        else
                            System.out.println("Your new password is created. ");
                    }
                }
            break;
        }
    }
}

