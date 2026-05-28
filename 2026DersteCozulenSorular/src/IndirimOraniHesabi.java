/**
 * Ürünlerin eski ve yeni fiyatlarına bakarak indirim oranını hesaplar
 * ve %20'den fazla indirimi olan ürünleri "kampanya" olarak listeler.
 *
 * KONULAR:
 *  - Paralel diziler (urunler, eskiFiyatlar, yeniFiyatlar — aynı indeks aynı ürün)
 *  - Bir metoda birden fazla dizi parametresi geçme
 *  - Sayaç (counter) kullanımı: kampanyaSayisi++
 *  - İndirim oranı formülü:
 *        İndirim Oranı = ((Eski Fiyat - Yeni Fiyat) / Eski Fiyat) * 100
 *
 * Bu kod soyle dusunulmus olabilir:
 *   - Eski Fiyat 700, Yeni Fiyat 800  →  oran negatif (indirim DEĞİL, zam)
 *   - Eski Fiyat 500, Yeni Fiyat 250  →  oran %50 (kampanya!)
 *   - Eski Fiyat 400, Yeni Fiyat 350  →  oran %12.5 (kampanya değil)
 */
public class IndirimOraniHesabi {

    static void main(String[] args) {
        // Paralel diziler: aynı indeks aynı ürünü temsil eder
        String[] urunler       = new String[]{"Polo Yaka", "Gömlek", "Şort"};
        double[] eskiFiyatlar  = new double[]{700,        500,      400};
        double[] yeniFiyatlar  = new double[]{800,        250,      350};

        int kampanyaSayisi = indirimOraniDondur(urunler, eskiFiyatlar, yeniFiyatlar);
        System.out.println("Kampanya sayısı: " + kampanyaSayisi);
    }

    /**
     * Her ürün için indirim oranını hesaplar, %20'den büyükse "kampanya" sayar.
     *
     * @return Kampanyaya giren ürün sayısı
     */
    static int indirimOraniDondur(String[] urunler, double[] eskiFiyatlar, double[] yeniFiyatlar) {
        int kampanyaSayisi = 0;
        double[] indirimOranlari = new double[urunler.length];

        // İndirim Oranı = ((Eski Fiyat - Yeni Fiyat) / Eski Fiyat) * 100
        for (int i = 0; i < urunler.length; i++) {
            double indirimOrani = ((eskiFiyatlar[i] - yeniFiyatlar[i]) / eskiFiyatlar[i]) * 100;
            indirimOranlari[i] = indirimOrani;

            if (indirimOranlari[i] > 20) {
                System.out.println("Kampanyalı ürün: " + urunler[i]);
                kampanyaSayisi++;
            }
        }

        return kampanyaSayisi;
    }
}
