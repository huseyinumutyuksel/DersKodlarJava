import java.util.Random;

/**
 * Rastgele bir FM radyo frekansı üretir ve frekansa göre yayın yapan istasyonu yazdırır.
 *
 * KONULAR:
 *  - switch - case yapısı
 *  - Math.round() ile yuvarlama (double → en yakın long)
 *  - Random.nextDouble(min, max) ile aralık içinde ondalıklı rastgele
 *  - break ile case'den çıkış (yoksa "fall-through" oluşur)
 *  - default ile hiçbir case eşleşmediğinde çalışacak blok
 *
 * NOT: Math.round bir double'ı en yakın tam sayıya yuvarladığı için,
 *      94.50 gibi ondalıklı frekanslar case'lerle nadiren eşleşir.
 *      Bu nedenle çoğunlukla default bloğu çalışır.
 *
 * NOT2: IO.println Java 23+ preview özelliğidir.
 */
public class RadyoFrekansSwitch {
    public static void main(String[] args) {
        double frekans = radyo();
        frekans = Math.round(frekans); // en yakın tam sayıya yuvarla

        switch ((int) frekans) {
            case 101: // ~100.9 frekansı
                IO.println(frekans + " mhz  " + " Ahmet Kaya");
                break;
            case 103: // ~102.7 frekansı
                IO.println(frekans + " mhz  " + " Sezen Aksu");
                break;
            case 104: // ~103.5 frekansı
                IO.println(frekans + " mhz  " + " aaa");
                // break yok → bilerek fall-through olarak bırakılmış olabilir
                // ama genelde break ile bitirmek daha güvenli
                break;
            default:
                IO.println(frekans + " - aloooooooooooooooooooo");
        }
    }

    /**
     * 94.00 ile 108.00 arasında rastgele ondalıklı bir FM frekansı üretir.
     */
    public static double radyo() {
        Random random = new Random();
        return random.nextDouble(94.00, 108.00);
    }
}
