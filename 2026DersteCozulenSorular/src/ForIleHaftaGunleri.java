import java.util.Random;

/**
 * Haftanın günlerini yazdırır, ardından farklı for döngüsü tiplerini gösterir.
 *
 * KONULAR:
 *  - String dizisi üzerinde for-each (gelişmiş for)
 *  - Klasik for döngüsü ile toplama (sum += i)
 *  - Rastgele artış (i += random.nextInt(1,7)) — düzensiz adımlı döngü
 *  - IO.println (Java 23 preview)
 *
 * NOT: IO sınıfı Java 23+ preview özelliğidir. JDK 23 ve --enable-preview gerekir.
 */
public class ForIleHaftaGunleri {

    void main() {
        Random random = new Random();
        String[] haftaninGunleri = new String[] {
                "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"
        };

        // Dizinin tüm elemanlarını yazdır
        gunleriYaz(haftaninGunleri);

        // 1'den 5'e kadar olan sayıları toplama
        int sum = 0;
        for (int i = 1; i <= 5; i++) {  // i++  =>  i = i + 1
            sum += i;                    // sum = sum + i
        }
        System.out.println("Sum is " + sum);

        // Rastgele adımlı (1-6) for döngüsü — her iterasyonda farklı miktarda artar
        for (int sayac = 1; sayac < 300; sayac += random.nextInt(1, 7)) {
            System.out.println("For'un içerisindeyim " + sayac);
        }
    }

    /**
     * Gelişmiş for (for-each) ile dizinin tüm elemanlarını yazdırır.
     */
    void gunleriYaz(String[] haftaninGunleri) {
        for (String gun : haftaninGunleri) {
            IO.println(gun);
        }
    }
}
