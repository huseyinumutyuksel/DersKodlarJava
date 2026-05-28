import java.util.Scanner;

/**
 * Ortamın nem miktarına göre ürünleri (Domates, Karpuz) sulayan bir simülasyon.
 *
 * KONULAR:
 *  - Aynı .java dosyasında birden fazla sınıf tanımlama
 *    (public sınıf dosya adıyla aynı olmalı; diğerleri public OLAMAZ)
 *  - Constructor overloading (parametresiz + parametreli)
 *  - switch - case ile ürün seçimi
 *  - Nesne referansı null kontrolü (if (secilenUrun != null))
 *
 * NOT: SulanacakUrun sınıfı bu dosyanın içinde tanımlıdır (paket-private).
 */
public class UrunSulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İki ürünü önceden tanımlıyoruz — gerçek bir sensör projesinde
        // bunlar veritabanından veya konfig dosyasından gelebilir
        SulanacakUrun domates = new SulanacakUrun("Domates", 60);
        SulanacakUrun karpuz  = new SulanacakUrun("Karpuz",  80);

        System.out.print("Ortam nem miktarını giriniz: ");
        int ortamNemMiktari = scanner.nextInt();

        System.out.print("Ürün adını giriniz (Domates/Karpuz): ");
        String urunAdi = scanner.next();

        SulanacakUrun secilenUrun = null; // henüz seçilmedi
        switch (urunAdi) {
            case "Karpuz":
                secilenUrun = karpuz;
                break;
            case "Domates":
                secilenUrun = domates;
                break;
            default:
                System.out.println("Tanımsız ürün.");
        }

        // null kontrolü → "Tanımsız ürün" girildiyse hesabı atla
        if (secilenUrun != null) {
            sulama(ortamNemMiktari, secilenUrun);
        }

        scanner.close();
    }

    /**
     * Ortam nemi, ürünün gerekli neminden düşükse ürünü "sular".
     */
    static void sulama(int ortamNemMiktari, SulanacakUrun sulanacakUrun) {
        if (ortamNemMiktari < sulanacakUrun.nemMiktari) {
            System.out.println("Sulanacak ürün: " + sulanacakUrun.urunAdi);
            System.out.println("Ürün sulandı.");
        } else {
            System.out.println("Sulama gerekmemektedir.");
        }
    }
}

/**
 * Sulanması gereken bir ürünün özelliklerini tutar.
 * UrunSulama.java dosyası içindeki yardımcı sınıf — public OLAMAZ.
 */
class SulanacakUrun {
    String urunAdi;
    int nemMiktari;
    double sicaklik;

    /** Parametresiz constructor — alanlar varsayılan değerleriyle başlar */
    SulanacakUrun() {}

    /** Parametreli constructor — urunAdi ve nemMiktari ile başlat */
    SulanacakUrun(String urunAdi, int nemMiktari) {
        this.urunAdi = urunAdi;
        this.nemMiktari = nemMiktari;
    }
}
