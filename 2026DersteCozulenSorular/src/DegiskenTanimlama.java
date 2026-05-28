import java.util.Scanner;

/**
 * Java'da değişken tanımlama ve klavyeden veri alma temellerini gösterir.
 *
 * KONULAR:
 *  - Değişken tanımlama söz dizimi: "veriTipi degiskenAdi = deger;"
 *  - Temel veri tipleri: int, double
 *  - Scanner ile klavyeden veri okuma
 *
 * SÖZ DİZİMİ:
 *   veriTipi degiskenAdi = baslangicDegeri;
 *   Örnek:  int sayi = 0;
 *           double fiyat = 0.0;
 *           Scanner scanner = new Scanner(System.in);
 */
public class DegiskenTanimlama {
    public static void main(String[] args) {
        // Java'nın kendisinde olan ve klavyeden bilgi girişi için kullanılan
        // Scanner sınıfından bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // İlkel veri tipinde değişkenler — başlangıç değeri ile tanımlanır
        int sayi = 0;
        double fiyat = 0.0;

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt(); // klavyeden tam sayı oku

        System.out.println("Tanımlı sayı: " + sayi);
        System.out.println("Tanımlı fiyat: " + fiyat);
        System.out.println("Girilen yaş: " + yas);

        scanner.close();
    }
}
