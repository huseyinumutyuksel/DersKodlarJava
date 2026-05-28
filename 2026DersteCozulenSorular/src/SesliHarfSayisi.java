import java.util.Scanner;

/**
 * Kullanıcıdan alınan metindeki Türkçe sesli harf sayısını hesaplar.
 *
 * KONULAR:
 *  - String → char dizisi mantığı (charAt(i))
 *  - String.toLowerCase() ile karşılaştırmayı kolaylaştırma
 *  - char karşılaştırması ('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü')
 *  - char vs String farkı: char tek karakter, String karakter dizisi
 *
 * TÜRKÇE SESLİ HARFLER: a, e, ı, i, o, ö, u, ü  (8 adet)
 */
public class SesliHarfSayisi {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println("Metindeki sesli harf sayısı: " + sesliHarfSayisiSay(metin));

        scanner.close();
    }

    /**
     * Verilen metindeki Türkçe sesli harflerin sayısını döndürür.
     * Hem büyük hem küçük harfleri sayar (önce küçük harfe çevirerek).
     */
    static int sesliHarfSayisiSay(String metin) {
        int sesliHarfSayisi = 0;
        metin = metin.toLowerCase(); // büyük harfleri küçük harfe çevir

        for (int i = 0; i < metin.length(); i++) {
            // metin.charAt(i) → i. indeksteki karakteri (char) döner
            // String aslında bir char dizisidir: bir veya daha fazla char'ın bir araya gelmiş hali
            char harf = metin.charAt(i);

            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i'
                    || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü') {
                sesliHarfSayisi++;
            }
        }

        return sesliHarfSayisi;
    }
}
