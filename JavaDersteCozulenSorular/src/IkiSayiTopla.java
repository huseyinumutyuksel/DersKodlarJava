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
        int klavyedengeliceksayi = scn.nextInt(); // Kul