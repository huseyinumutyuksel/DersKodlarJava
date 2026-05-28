import java.util.Scanner;

/**
 * İki kenar uzunluğu ve aralarındaki açı bilinen bir üçgenin alanını hesaplar.
 *
 * KONULAR:
 *  - double veri tipi (ondalıklı sayılar)
 *  - Math.sin() hazır metodu
 *  - Scanner ile double (ondalıklı) veri okuma
 *
 * FORMÜL:
 *  Alan = (kenar1 × kenar2 × sin(açı)) / 2
 *
 * ÖNEMLİ NOT:
 *  Math.sin() metodu açıyı radyan cinsinden bekler!
 *  Derece → Radyan dönüşümü: Math.toRadians(derece) kullanılabilir.
 *  Örneğin 30 derece → Math.toRadians(30) ≈ 0.5236 radyan
 */
public class SinusTeoremi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz:");
        double kenar1 = scanner.nextDouble(); // double → ondalıklı sayı tipi

        System.out.println("İkinci kenar uzunluğunu giriniz:");
        double kenar2 = scanner.nextDouble();

        System.out.println("Kenarlar arası açı değerini giriniz (radyan cinsinden):");
        double aci = scanner.nextDouble(); // Açı radyan cinsinden girilmeli

        // Alan = (a × b × sin(C)) / 2  — sinüs teoremi ile alan hesabı
        double alan = kenar1 * kenar2 * Math.sin(aci) / 2;

        System.out.println("Alan değeri: " + alan);
    }
}
