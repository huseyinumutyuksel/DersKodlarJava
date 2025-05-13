import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        //Harmonik ortalama hesaplayalım
        Scanner scanner = new Scanner(System.in);
        double harmonikOrt = 0;
        int sayac = 0;
        double sayi = 0;
        do {
            System.out.println("Bir sayı giriniz:");
            sayi = scanner.nextDouble();
            if (sayi != 0) {
                harmonikOrt += 1.0 / sayi;
                sayac++;
            }
        } while (sayi != 0);
        //System.out.println("A katsayısını giriniz:");
        harmonikOrt = (double) sayac / harmonikOrt;
        System.out.println("Harmonik ortalama sonucu:" + harmonikOrt);
    }
}
