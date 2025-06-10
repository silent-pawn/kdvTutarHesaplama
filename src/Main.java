import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tutar Giriniz : ");

        double price = scan.nextDouble();
        double rate;

        if (price <= 500) {
            rate = 18;
        } else {
            rate = 10;
        }



        double kdvPrice = price * (rate / 100);
        double total = price + kdvPrice;

        System.out.println("KDV Oranı : % " + (int)rate);
        System.out.println("KDV Tutarı : " + kdvPrice);
        System.out.println("KDV'li Tutar: " + total);


    }
}