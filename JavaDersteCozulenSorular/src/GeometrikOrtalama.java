import java.util.Scanner;

/**
 * Kullanıcı 0 girene kadar sayı alır ve girilen sayıların geometrik ortalamasını hesaplar.
 *
 * KONULAR:
 *  - while döngüsü (belirsiz sayıda tekrar)
 *  - Math.pow() ile kök alma
 *  - double tipi ile kümülatif çarpım
 *
 * FORMÜL:
 *  Geometrik Ortalama = (x1 × x2 × ... × xn) ^ (1/n)
 *  Yani tüm sayıların çarpımının n'inci kökü alınır.
 *
 * ÖRNEK: 2, 8, 32 için → (2×8×32)^(1/3) = 512^(1/3) = 8
 */
public class GeometrikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz. Çıkmak için 0 giriniz:");
        double sayi = scanner.nextDouble();
        double carpım = 1; // Tüm sayıların çarpımını tutacak değişken (başlangıç: 1)
        int sayac = 0;     // Kaç sayı girildiğini sayar

        while (sayi != 0) {   // 0 girilene kadar devam et
            carpım *= sayi;   // Sayıyı toplam çarpıma ekle
            sayac++;
            System.out.println("Sayı giriniz. Çıkmak için 0 giriniz:");
            sayi = scanner.nextDouble();
            if (sayi != 0) {
                carpım *= sayi;
                sayac++;
                System.out.println("Sayı giriniz. Çıkmak için 0 giriniz:");
                sayi = scanner.nextDouble();
            }
        }

        // Geometrik ortalama = çarpım^(1/n)
        // Math.pow(a, b) → a^b  ;  1/n = 1.0/sayac (double bölme)
        double ortalama = Math.pow(carpım, 1.0 / (double) sayac);
        System.out.println(sayac + " sayının geometrik ortalaması: " + ortalama);
    }
}
