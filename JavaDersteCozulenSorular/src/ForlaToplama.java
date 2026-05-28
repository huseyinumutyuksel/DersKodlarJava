import java.util.Scanner;

/**
 * Verilen başlangıç, bitiş ve adım değerlerine göre sayıları toplar.
 * for döngüsünün adım değerini (increment) gösterir.
 *
 * KONULAR:
 *  - for döngüsünün 3 bölümü: başlangıç ; koşul ; artış
 *  - i += adim  →  i = i + adim  (i++ özel durumu: adim=1)
 *  - toplam += i  →  toplam = toplam + i
 *
 * FOR DÖNGÜSÜ YAPISI:
 *  for (int i = başlangıç ; i <= bitiş ; i += adım) { ... }
 *       ↑ başlangıç        ↑ koşul      ↑ her turda ne kadar artsın
 *
 * ÖRNEK: başlangıç=1, bitiş=10, adım=1 → 1+2+3+...+10 = 55
 * ÖRNEK: başlangıç=2, bitiş=10, adım=2 → 2+4+6+8+10   = 30
 */
public class ForlaToplama {
    public static void main(String[] args) {
        Scanne