import java.util.Scanner;

/**
 * Klavyeden alınan bir tamsayının basamaklarını ters sırada ekrana yazdırır.
 * Örnek: 1234 girilirse → 4321 çıktısı verir.
 *
 * KONULAR:
 *  - while döngüsü
 *  - Mod (%) operatörü: sayının son basamağını almak için kullanılır
 *  - Tam bölme (/): sayının son basamağını atmak için kullanılır
 *
 * ALGORİTMA (1234 örneği):
 *  Adım 1: 1234 % 10 = 4  → yazdır, 1234 / 10 = 123
 *  Adım 2:  123 % 10 = 3  → yazdır,  123 / 10 = 12
 *  Adım 3:   12 % 10 = 2  → yazdır,   12 / 10 = 1
 *  Adım 4:    1 % 10 = 1  → yazdır,    1 / 10 = 0  (sayi == 0, döngü biter)
 */
public class SayiTersten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt(); // Klavyeden girilen sayıyı okuduk

        System.out.print("Tersten yazılışı: ");
        while (sayi != 0) {           // sayi 0 olana kadar devam et
            System.out.print(sayi % 10); // Son basamağı yazdır
            sayi /= 10;                  // Son basamağı düşür (sayi = sayi / 10)
        }
    }
}
