import java.util.Random;

/**
 * Metot aşırı yükleme (method overloading) örneği.
 *
 * AŞIRI YÜKLEME (overloading):
 *  Aynı isimli ama farklı parametre listesine sahip birden fazla metot
 *  tanımlamaktır. Java, çağrı sırasındaki argümanlara bakarak hangi metodu
 *  çalıştıracağını otomatik seçer.
 *
 * KONULAR:
 *  - static metot tanımı
 *  - Random sınıfı (rastgele sayı üretimi)
 *  - Metot aşırı yükleme (overloading)
 *
 * ÖRNEK:
 *   rastgeleSayiUret()         → tüm int aralığında rastgele
 *   rastgeleSayiUret(1, 100)   → 1-99 arası rastgele
 */
public class MetotAsiriYukleme {
    public static void main(String[] args) {
        // Aynı isimli metodun iki farklı versiyonu da burada çağrılabilir
        int herhangiBir = rastgeleSayiUret();
        int aralikIcinde = rastgeleSayiUret(1, 100);

        System.out.println("Herhangi bir rastgele int: " + herhangiBir);
        System.out.println("1-99 arası rastgele: " + aralikIcinde);
    }

    /**
     * İki sınır arasında rastgele bir tam sayı üretir.
     * @param aralikBaslangici Dahil edilen alt sınır
     * @param aralikSonu      Dahil edilmeyen üst sınır
     */
    public static int rastgeleSayiUret(int aralikBaslangici, int aralikSonu) {
        Random rnd = new Random();
        return rnd.nextInt(aralikBaslangici, aralikSonu);
    }

    /**
     * Parametresiz versiyon — tüm int aralığında rastgele sayı üretir.
     */
    public static int rastgeleSayiUret() {
        Random rnd = new Random();
        return rnd.nextInt();
    }
}
