/**
 * Bir ürünü temsil eden POJO sınıfı (urunAdi, fiyat, stokMiktari).
 *
 * KONULAR (OOP):
 *  - private alanlar (encapsulation)
 *  - Parametreli constructor
 *  - Getter / Setter çiftleri
 *  - toString() metodunu override etme (@Override)
 *
 * @Override: Üst sınıftan (Object) gelen metodu yeniden tanımladığımızı belirtir.
 *            Yazım hatası varsa derleyici uyarır.
 */
public class Urun {
    private String urunAdi;
    private double fiyat;
    private int stokMiktari;

    public Urun(String urunAdi, double fiyat, int stokMiktari) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.stokMiktari = stokMiktari;
    }

    // ----- GETTER metotları -----
    public String getUrunAdi()     { return urunAdi; }
    public double getFiyat()       { return fiyat; }
    public int    getStokMiktari() { return stokMiktari; }

    // ----- SETTER metotları -----
    public void setUrunAdi(String urunAdi)       { this.urunAdi = urunAdi; }
    public void setFiyat(double fiyat)           { this.fiyat = fiyat; }
    public void setStokMiktari(int stokMiktari)  { this.stokMiktari = stokMiktari; }

    /**
     * Nesne yazdırıldığında (System.out.println(urun) gibi) bu metnin
     * çıkmasını sağlar. Object sınıfından gelen toString() metodunu override eder.
     */
    @Override
    public String toString() {
        return "Urun{" +
                "urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                ", stokMiktari=" + stokMiktari +
                '}';
    }
}
