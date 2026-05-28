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
        int ust = scn.next