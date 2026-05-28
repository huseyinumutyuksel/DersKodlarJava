import java.util.Random;

/**
 * 0-49 arasından tekrarsız 6 rastgele sayı seçerek sayısal loto kuponu oluşturur.
 *
 * KONULAR:
 *  - Random sınıfı ile rastgele sayı üretme
 *  - Dizi içinde tekrar kontrolü (iç içe döngü)
 *  - while döngüsü ile koşullu ilerleme
 *  - break ifadesi ile döngüden çıkma
 *
 * ALGORİTMA:
 *  1. Dizi dolana kadar rastgele sayı üret
 *  2. Üretilen sayı dizide zaten var mı kontrol et (iç for döngüsü)
 *  3. Yoksa diziye ekle (i artar), varsa yeni sayı üret (i artmaz)
 *  4. Trick: for döngüsü normalde sonuna ulaşırsa j == 6 olur → sayı benzersizdir
 */
public class SayisalLoto {
    public static void main(String[] args) {
        int i = 0; // dizi doldurma sayacı (kaç benzersiz sayı bulundu)
        int j = 0; // tekrar kontrol sayacı
        int[] loto = new int[6]; // 6 benzersiz sayıyı tutacak dizi
        Random random = new Random();

        while (i < 6) { // 6 benzersiz sayı bulunana kadar devam et
            int n = random.nextInt(50); // 0-49 arası rastgele sayı üret

            // Üretilen sayı daha önce diziye eklenmiş mi? Kontrol edelim
            for (j = 0; j < 6; j++) {
                if (loto[j] == n) {
                    break; // Tekrar bulundu! Döngüden çık (j < 6 olur)
                }
            }

            // Eğer for döngüsü sonuna kadar gittiyse j == 6 demektir → sayı benzersizdir
            if (j == 6) {
                loto[i] = n; // Benzersiz sayıyı diziye ekle
                i++;         // Bir sonraki pozisyona geç
            }
            // j < 6 ise sayı tekrarlıydı, while başa döner ve yeni sayı üretilir
        }

        // Loto kuponunu ekrana yazdır
        System.out.print("Loto Kuponu: ");
        for (i = 0; i < 6; i++) {
            System.out.print(loto[i] + "\t");
        }
    }
}
