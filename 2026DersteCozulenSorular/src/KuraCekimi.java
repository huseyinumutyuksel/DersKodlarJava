import java.util.Random;

/**
 * Bir aday listesinde dolaşıp belirli bir ismi bulunca çekilişi sonlandırır.
 *
 * KONULAR:
 *  - for-each (gelişmiş for) ile String dizisi gezme
 *  - String.equals() ile metin karşılaştırma
 *    (== ile DEĞİL — == referansları karşılaştırır, equals() içeriği)
 *  - break ile döngüden erken çıkış
 *  - Random kullanımı (sensorDegeri demo amaçlı)
 *
 * NOT: IO sınıfı ve parametresiz main Java 23+ preview özelliğidir.
 */
public class KuraCekimi {

    // İç içe for döngüsü örneği — burada tek for yeterli ama yapı genişletilebilir
    void main() {
        Random random = new Random();
        // Random sınıfından "random" adlı bir nesne türettik
        int sensorDegeri = random.nextInt();
        // random nesnesi üzerinden nextInt() metoduyla bir tam sayı aldık

        String kazanacakIsim = "Yaşar";
        String[] kuraListesi = {"Ahmet", "Eray", "Furkan", "Samet", "Mehmet", "Özgür", "Uğur", "Yaşar"};

        for (String talihli : kuraListesi) {
            // String karşılaştırması "==" ile YANLIŞ olur,
            // .equals() metodu içerik karşılaştırması yapar.
            if (talihli.equals(kazanacakIsim)) {
                IO.println("Çekiliş kazananı: " + talihli);
                break; // bulundu, döngüden çık
            }
        }
    }
}
