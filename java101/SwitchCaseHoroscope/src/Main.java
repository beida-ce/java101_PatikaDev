import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month, day;
        String horoscope = null;
        boolean isError = false;

        System.out.println("Enter your birth month: ");
        month = scan.nextInt();
        System.out.println("Enter your birthday: ");
        day = scan.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "capricorn";
                } else
                    horoscope = "aquarius";
            } else
                isError = true;
        }

        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    horoscope = "aquarius";
                } else
                    horoscope = "fish";
            } else
                isError = true;
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    horoscope = "fish";
                } else
                    horoscope = "aries";
            } else
                isError = true;
        }

        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    horoscope = "aries";
                } else
                    horoscope = "taurus";
            } else
                isError = true;
        }

        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    horoscope = "taurus";
                } else
                    horoscope = "gemini";
            } else
                isError = true;
        }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    horoscope = "gemini";
                } else
                    horoscope = "cancer";
            } else
                isError = true;
        }

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "cancer";
                } else
                    horoscope = "leo";
            } else
                isError = true;
        }

        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "leo";
                } else
                    horoscope = "virgo";
            } else
                isError = true;
        }

        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    horoscope = "virgo";
                } else
                    horoscope = "libra";
            } else
                isError = true;
        }

        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    horoscope = "libre";
                } else
                    horoscope = "scorpio";
            } else
                isError = true;
        }

        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "scorpio";
                } else
                    horoscope = "sagittarius";
            } else
                isError = true;
        }

        if (month == 12) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    horoscope = "sagittarius";
                } else
                    horoscope = "capricorn";
            } else
                isError = true;
        }

        if (month > 12 || month < 1)
            isError = true;

        if (isError)
            System.out.println("You entered something wrong.");

        else
            System.out.println("Your horoscope is: " + horoscope);
    }
}