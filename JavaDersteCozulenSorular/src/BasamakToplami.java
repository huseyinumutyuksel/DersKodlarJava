import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        //Klavyeden girilen sayıyı basamaklara ayırıp basamak toplamını bulan kod
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt(); // Klavyeden girilen sayıyı okuduk
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        System.out.println("Toplamın sonucu:" + toplam);
    }
}
