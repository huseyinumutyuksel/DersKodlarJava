import java.util.Random;
import java.util.Scanner;

/**
 * Rastgele üretilen bir sayıyla kullanıcının girdiği sayıyı çarpan döngülü program.
 * Kullanıcı -1 girene kadar devam eder (sentinel value pattern).
 *
 * KONULAR:
 *  - main metodu içinde başka metot çağırma
 *  - while(true) + break ile sonsuz döngüden çıkış
 *  - Sentinel (bekçi) değer: -1 girilince çık
 *  - Birden fazla static metot
 *
 * NOT: IO.println Java 23+ preview özelliğidir.
 */
public class CarpmaWhileMetodu {

    static void main() {
        IO.println("");
        /*
         * Main metodu içinde program akışı başlar.
         * İhtiyaç duyduğum metotları (deneme, carp) burada çağırırım.
         * Bazı metotlar argüman (parametre) alır, bazıları almaz.
         */
        for (int i = 0; i < 10; i++) {
            IO.println("Sonuç: " + deneme()); // deneme metodunu çağır
        }
    }

    /*
     * deneme metodu:
     *  - public          → her yerden erişilebilir
     *  - static          → nesne türetmeden çağrılabilir (Memo m = new Memo() gerekmez)
     *  - int             → geriye tam sayı döner (return ile)
     *  - parametre almaz → ()
     */
    public static int deneme() {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int rastgele = rnd.nextInt(1, 35);
            IO.println("Rastgele üretilen: " + rastgele);
            IO.print("Bir sayı giriniz (-1 = çıkış): ");
            int sayi2 = scanner.nextInt();

            if (sayi2 != -1) {
                return carp(rastgele, sayi2); // sonucu döndürüp metoddan çık
            } else {
                break; // -1 girildiyse döngüden çık
            }
        }
        return -1; // çıkış durumunda dönen değer
    }

    /** İki tam sayıyı çarpar. */
    public static int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
}
