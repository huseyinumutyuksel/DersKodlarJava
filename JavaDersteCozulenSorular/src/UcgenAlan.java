import java.util.Scanner;

/**
 * Taban ve yükseklik bilgisiyle üçgenin alanını hesaplar.
 *
 * KONULAR:
 *  - double veri tipi ile aritmetik işlemler
 *  - Scanner ile ondalıklı sayı (nextDouble) okuma
 *
 * FORMÜL:
 *  Alan = (taban × yükseklik) / 2
 */
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yüksekliği giriniz:");
        double yukseklik = scanner.nextDouble(); // ondalıklı değer alıyoruz

        System.out.println("Taban uzunluğunu giriniz:");
        double taban = scanner.nextDouble();

        // Üçgen alan formülü: (taban × yükseklik) / 2
        double alan = (taban * yukseklik) / 2;

        System.out.println("Alan: " + alan);
    }
}
