import java.util.Scanner;

/**
 * Diziler üzerinde temel işlemleri gösterir:
 * yazdırma, toplama, eleman güncelleme, indeks ile arama.
 *
 * KONULAR:
 *  - String dizisi: hem süslü parantezle hem new String[] ile tanımlama
 *  - for-each (gelişmiş for) vs klasik for
 *  - Dizi elemanlarını toplama
 *  - dizi.length ile boyut, dizi[length-1] ile son eleman
 *  - Kullanıcıdan indeks alıp sınır kontrolü yapma
 *
 * NOT: IO sınıfı Java 23+ preview özelliğidir.
 */
public class DiziUzerindeIslem {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Süslü parantezle tanımlama — kısa yol
        String[] meyveler = {"Elma", "Armut", "Kiraz", "Muz", "Çilek", "Portakal"};

        // new String[] {...} ile tanımlama — açık yol
        String[] sebzeler = new String[] {"Marul", "Havuç", "Soğan"};

        // for-each: tüm elemanları sırayla "meyve" değişkenine kopyalar
        for (String meyve : meyveler) {
            IO.println(meyve);
        }

        // Klasik for: indeks ile erişim
        for (int i = 0; i < sebzeler.length; i++) {
            IO.println(sebzeler[i]);
        }

        // Dizinin her bir elemanına indis(index) numarası verilir.
        // 0'dan başlar — yani indis 0, dizinin 1. elemanına karşılık gelir.
        // Diziler hızlı olduğu için tercih edilir.

        int[] numaralar = {10, 20, 30, 40, 50};
        int numaralarToplami = 0;
        for (int numara : numaralar) {
            numaralarToplami += numara;
        }
        IO.println("Numaraların toplamı: " + numaralarToplami);

        // Son elemanın değerini değiştir (indeks: length - 1)
        numaralar[numaralar.length - 1] = 100;

        IO.println("Aradığın indis sayısını giriniz:");
        int aradigimIndisSayisi = scanner.nextInt();

        // Sınır kontrolü — IndexOutOfBoundsException'ı engelle
        if (aradigimIndisSayisi >= 0 && aradigimIndisSayisi < numaralar.length) {
            IO.println("Değer: " + numaralar[aradigimIndisSayisi]);
        } else {
            IO.println("Aradığın indis dizinin sınırları dışında.");
        }

        scanner.close();
    }
}
