import java.util.Scanner;

/**
 * 1'den n'e kadar sayılarla doldurulmuş bir diziyi ters sırada yazdırır.
 *
 * KONULAR:
 *  - Dizi tanımlama ve doldurma
 *  - dizi.length ile dizi boyutuna erişme
 *  - Geçici (temp) dizi kullanarak ters çevirme
 *
 * ALGORİTMA (n=5 için örnek):
 *  Orijinal dizi : [1, 2, 3, 4, 5]
 *  diziTemp[i] = dizi[n-1-i] → dizi[4]=5, dizi[3]=4, ...
 *  Geçici dizi  : [5, 4, 3, 2, 1]
 *  Son çıktı    : 5  4  3  2  1
 *
 * İNDEKS MANTIĞI:
 *  i=0 → dizi[4]=5   (n-1-0 = 4)
 *  i=1 → dizi[3]=4   (n-1-1 = 3)
 *  i=2 → dizi[2]=3   (n-1-2 = 2)  ← ortada kesişir
 */
public class DiziTersten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz:");
        int n = scanner.nextInt();

        int[] dizi = new int[n]; // n elemanlı dizi tanımla

        // Diziyi 1'den n'e kadar sayılarla d