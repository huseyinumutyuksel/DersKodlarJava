import java.util.Scanner;

/**
 * Taban^üs (üs alma) işlemini hem döngü hem de Math.pow() ile hesaplar.
 * İki yöntemi karşılaştırarak Math kütüphanesinin kullanımını gösterir.
 *
 * KONULAR:
 *  - for döngüsü ile tekrarlı çarpım
 *  - Math.pow() hazır metodu
 *  - int ve double tip farkı
 *
 * ÖRNEK: taban=3, ust=4 → 3^4 = 3×3×3×3 = 81
 */
public class TabanUstAlma {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Taban değerini giriniz:");
        int taban = scn.nextInt();
        System.out.println("Üst değerini giriniz:");
        int ust = scn.nextInt();

        // YÖNTem 1: For döngüsü ile manuel üs alma
        // sonuc başlangıçta taban'ın kendisi, (ust-1) kez daha çarpılır
        int sonuc = taban;
        for (int i = 1; i < ust; i++) {
            sonuc *= taban; // her adımda taban ile çarp
        }
        System.out.println("Döngü ile sonuç: " + sonuc);

        // YÖNTem 2: Math.pow() hazır metodu ile (double döner)
        double sonucPow = Math.pow(taban, ust);
        System.out.println("Math.pow() ile sonuç: " + sonucPow);
    }
}


