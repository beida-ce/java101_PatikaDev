import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOfMoney, kdvAmount, amountOfKdvMoney, ratio1, ratio2;
        ratio1=0.08;
        ratio2=0.18;

        System.out.println("KDV'sini hesaplamak istediğiniz para miktarını giriniz: ");
        amountOfMoney = scan.nextDouble();

        kdvAmount = (amountOfMoney <= 1000.0) ? amountOfMoney*ratio1 : amountOfMoney*ratio2;

        amountOfKdvMoney = kdvAmount + amountOfMoney;

        System.out.println("KDV dahil edilmeden önceki para miktarı: " + amountOfMoney);
        System.out.println("KDV miktarı: " + kdvAmount);
        System.out.println("KDV dahil edildikten sonraki para miktarı: " + amountOfKdvMoney);
    }
}