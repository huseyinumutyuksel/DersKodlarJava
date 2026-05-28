import java.util.Random;
import java.util.Scanner;

/**
 * Kullanıcıdan alınan bir sayıyı rastgele üretilen bir sayı ile toplayan program.
 *
 * KONULAR:
 *  - Scanner ile klavyeden veri okuma
 *  - Random ile rastgele sayı üretme
 *  - Parametreli ve geri dönüş değeri olan metot tanımlama & çağırma
 */
public class IkiSayiTopla {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bir sayı giriniz:");
        int klavyedengeliceksayi = scn.nextInt(); // Kullanıcıdan tam sayı alıyoruz

        // nextInt(150) → 0 ile 149 arasında (150 dahil değil) rastgele tamsayı üretir
        int rastgelegeliceksayi = random.nextInt(150);

        // Toplama işlemini ayrı bir metotta gerçekleştiriyoruz
        int sonuc = sayiTopla(klavyedengeliceksayi, rastgelegeliceksayi);

        System.out.println("Rastgele üretilen sayı: " + rastgelegeliceksayi);
        System.out.println("Toplam: " + sonuc);
    }

    /**
     * İki tamsayıyı toplayıp sonucu döndüren metot.
     * "static" → nesne oluşturmadan çağrılabilir
     * "int"    → geri dönüş tipi tamsayıdır
     *
     * @param sayi1 Birinci tamsayı
     * @param sayi2 İkinci tamsayı
     * @return İki sayının toplamı
     */
    public static int sayiTopla(int sayi1, int sayi2) {
        return sayi1 + sayi2; // hesabı yapıp sonucu çağırana geri gönder
    }
}