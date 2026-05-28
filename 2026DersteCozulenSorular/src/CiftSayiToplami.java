import java.util.Scanner;

/**
 * 1'den verilen limite kadar olan çift sayıların toplamını hesaplar
 * ve her adımda mevcut toplam değerini gösterir.
 *
 * Bu soru ders sırasında 14. vize sorusu olarak çözülmüştür.
 *
 * KONULAR:
 *  - for döngüsü ile aralık tarama
 *  - if + mod (i % 2 == 0) ile çift sayı kontrolü
 *  - Birikimli toplam (accumulator pattern)
 *  - IO.println ile satır sonu, IO.print ile aynı satıra yazma
 *
 * NOT: IO sınıfı ve parametresiz main Java 23+ preview özelliğidir.
 */
public class CiftSayiToplami {

    void main() {
        Scanner scanner = new Scanner(System.in);
        IO.print("Limit değerini giriniz: ");
        int limit = scanner.nextInt();

        ciftSayiTopla(limit);
        scanner.close();
    }

    /**
     * 1'den limit'e kadar olan tüm çift sayıları toplar ve her adımı yazdırır.
     */
    void ciftSayiTopla(int limit) {
        int toplam = 0;
        for (int i = 1; i <= limit; i = i + 1) {
            if (i % 2 == 0) {            // i çift mi?
                toplam = toplam + i;      // toplama ekle
                IO.print("Mevcut i değeri: " + i);
                IO.println(" Mevcut toplam değeri: " + toplam);
            }
        }
    }
}
