import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt(); // Klavyeden girilen sayıyı okuduk
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            System.out.println("Girilen sayı asal sayıdır.");
        } else {
            System.out.println("Girilen sayı asal sayı değildir.");
        }
    }
}
