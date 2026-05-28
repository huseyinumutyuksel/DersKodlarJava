/**
 * İki sayıyı bölen ve yüzde hesabı yapan iki yardımcı metot içerir.
 *
 * KONULAR:
 *  - Parametre alan ve geri dönüş değeri olan metotlar
 *  - if-else ile sıfıra bölme kontrolü
 *  - (double) ile tip dönüşümü (cast)
 *
 * NOT: Bu sınıfta main metodu yoktur — yardımcı sınıf (utility class).
 *      Metotları başka bir sınıftan çağırmak için kullanılır.
 *      Örnek kullanım için bkz. IsabetliPasYuzdesi.java
 */
public class BolmeMetodu {

    /**
     * Tam sayı bölmesi yapar. Bölen sıfırsa hata mesajı yazıp 0 döner.
     *
     * @param sayi1 Bölünen
     * @param sayi2 Bölen
     * @return Bölüm (tam sayı). Bölen 0 ise 0.
     */
    public static int bolme(int sayi1, int sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("Hata: Sıfıra bölme yapılamaz.");
            return 0;
        }
    }

    /**
     * sayi2'nin sayi1 içindeki yüzdesini hesaplar.
     * Formül: (sayi2 * 100) / sayi1
     *
     * DİKKAT: int/int bölmesinde ondalıklı kısım kaybolur.
     *         Doğru yüzde için en az birini double'a cast etmek gerekir.
     *
     * @param sayi1 Toplam (payda)
     * @param sayi2 Parça (pay)
     * @return Yüzde değeri (double)
     */
    public static double yuzdeHesabi(int sayi1, int sayi2) {
        // (double) cast ile ondalıklı sonuç elde ederiz
        return (double) (sayi2 * 100) / sayi1;
    }
}
