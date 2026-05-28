import java.util.Random;

/**
 * Bir String dizisinden rastgele bir öğrenci seçer.
 * (Daha gelişmiş — dosyadan okuyan — versiyonu için bkz. RastgeleOgrenciSecimi/)
 *
 * KONULAR:
 *  - String dizisi tanımlama: new String[] { ... }
 *  - Random sınıfı ile dizi uzunluğu sınırında rastgele indeks
 *  - dizi[indeks] ile elemana erişim
 */
public class SansliOgrenciSecimi {

    static void main(String[] args) {
        Random random = new Random();

        String[] adaylar = new String[] {
                "Ramiz", "Cem", "Can", "Eray", "Yaşar", "Özgür"
        };

        // 0 ile (dizi.length - 1) arasında rastgele bir indeks üret
        int secilenIndex = random.nextInt(adaylar.length);

        System.out.println("Seçilen öğrenci sırası: " + secilenIndex);
        String secilenOgrenci = adaylar[secilenIndex];
        System.out.println("Seçilen Öğrenci: " + secilenOgrenci);

        // Sonraki adım: Seçilen öğrenciye soru sor, puan düş veya tahta önüne çağır...
    }
}
