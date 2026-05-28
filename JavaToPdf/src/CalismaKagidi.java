import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ============================================================
 *  ALGORITMA VE PROGRAMLAMA -- JAVA CALISMA KAGIDI
 *  2025-2026 Bahar Donemi | Final Sinavi Hazirlik Rehberi
 * ============================================================
 *
 * Bu dosya Java temel yapilarini gercek calisir kod ornekleriyle gosterir.
 * Her bolum bagimsiz bir metot; konular ayri ayri incelenebilir.
 *
 * BOLUMLER:
 *   1. Degiskenler ve Veri Tipleri
 *   2. Operatorler
 *   3. Kosullu Ifadeler (if-else, switch)
 *   4. Donguler (for, while, do-while, break, continue)
 *   5. Diziler (1D ve 2D, Arrays.sort)
 *   6. Metotlar (parametreli, void, overloading)
 *   7. Rastgele Sayilar (Random)
 *   8. String Islemleri
 *   9. Klavyeden Girdi Alma (Scanner)
 *
 * @author  Algoritma ve Programlama Dersi
 * @version 2025-2026
 */
public class CalismaKagidi {

    // =========================================================
    //  GIRIS NOKTASI
    // =========================================================

    /**
     * Programin basladigi metot. Her bolum demo metodu burada cagriliyor.
     */
    public static void main(String[] args) {
        baslik("JAVA CALISMA KAGIDI --- ALGORITMA VE PROGRAMLAMA");

        degiskenlerVeVeriTipleri();
        operatorler();
        kosulluIfadeler();
        donguler();
        diziler();
        metotlar();
        rastgeleSayilar();
        stringIslemleri();

        // Scanner demosu kullanici girdisi beklediginden yoruma alindi.
        // Test etmek isterseniz asagidaki satirin basindaki // isaretini kaldiriniz:
        // klavyedenGirdiAlma();

        System.out.println("\n=== Program tamamlandi. ===");
    }

    // =========================================================
    //  BOLUM 1 -- DEGISKENLER VE VERI TIPLERI
    // =========================================================

    /**
     * Java temel veri tiplerini, sabitleri ve tur donusumunu gosterir.
     *
     * Degisken : Veriyi bellekte saklayan isimlendirilmis kutu.
     * Sabit    : final ile tanimlanir, deger sonradan degistirilemez.
     * Cast     : Bir tipi baska bir tipe donusturme islemdir.
     */
    public static void degiskenlerVeVeriTipleri() {
        baslik("1. DEGISKENLER VE VERI TIPLERI");

        // --- Tam sayi tipleri ---
        byte  kucukSayi = 100;              // -128 ile 127 arasi
        short ortaSayi  = 30_000;           // -32.768 ile 32.767 (alt cizgi okunurluk icin)
        int   yasam     = 2025;             // En yaygin tam sayi tipi
        long  nufus     = 8_000_000_000L;   // Buyuk sayilar icin (sonuna L)

        // --- Ondalikli tipler ---
        float  sicaklik = 36.5f;            // Dusuk hassasiyet (sonuna f)
        double pi       = 3.14159265;       // Yuksek hassasiyet (varsayilan)

        // --- Diger tipler ---
        char    harf    = 'A';             // Tek karakter (tek tirnak)
        boolean aktifMi = true;             // Sadece true veya false

        // --- Sabit tanimlama (final) ---
        final double YERCEKIM = 9.81;       // final => deger degistirilemez!

        // --- String (metin) ---
        String mesaj = "Merhaba, Java!";    // Cift tirnak

        System.out.println("int    (yasam)    : " + yasam);
        System.out.println("long   (nufus)    : " + nufus);
        System.out.println("double (pi)       : " + pi);
        System.out.println("char   (harf)     : " + harf);
        System.out.println("boolean(aktifMi)  : " + aktifMi);
        System.out.println("final  (YERCEKIM) : " + YERCEKIM);
        System.out.println("String (mesaj)    : " + mesaj);

        // --- Tur donusumu (casting) ---
        double ondalikli = 9.99;
        int tamSayi = (int) ondalikli;       // Ondalik kisim kesilir => 9
        System.out.println("\nCasting  (int) 9.99   = " + tamSayi + "  (ondalik kesilir)");

        // --- int bolmesinde DIKKAT ---
        int a = 10, b = 3;
        int    yanlisBolme = a / b;           // = 3  (ondalik kaybolur!)
        double dogruBolme  = (double) a / b;  // = 3.333...
        System.out.println("int bolmesi  10/3  = " + yanlisBolme + "   <<< DIKKAT: ondalik kaybolur!");
        System.out.println("double bolme 10/3  = " + dogruBolme  + "  <<< Dogru: (double) cast");
    }

    // =========================================================
    //  BOLUM 2 -- OPERATORLER
    // =========================================================

    /**
     * Aritmetik, iliskisel, mantiksal ve atama operatorlerini gosterir.
     */
    public static void operatorler() {
        baslik("2. OPERATORLER");

        int x = 20, y = 6;

        System.out.println("=== Aritmetik ===");
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y) + "  (tam bolme)");
        System.out.println(x + " % " + y + " = " + (x % y) + "  (kalan -- mod)");

        System.out.println("\n=== Iliskisel ===");
        System.out.println(x + " == " + y + " : " + (x == y));
        System.out.println(x + " != " + y + " : " + (x != y));
        System.out.println(x + " >  " + y + " : " + (x > y));
        System.out.println(x + " <= " + y + " : " + (x <= y));

        System.out.println("\n=== Mantiksal ===");
        boolean p = true, q = false;
        System.out.println("true  && false = " + (p && q) + "  (VE:   ikisi de true ise true)");
        System.out.println("true  || false = " + (p || q) + "  (VEYA: biri true ise true)");
        System.out.println("!true          = " + (!p)     + "  (DEGIL: tersine cevir)");

        System.out.println("\n=== Atama kisaltmalari ===");
        int n = 10;
        System.out.println("n = " + n);
        n += 5;  System.out.println("n += 5  => " + n + "   (n = n + 5)");
        n -= 3;  System.out.println("n -= 3  => " + n + "   (n = n - 3)");
        n *= 2;  System.out.println("n *= 2  => " + n + "   (n = n * 2)");
        n /= 4;  System.out.println("n /= 4  => " + n + "   (n = n / 4)");
        n %= 3;  System.out.println("n %= 3  => " + n + "   (n = n % 3)");
    }

    // =========================================================
    //  BOLUM 3 -- KOSULLU IFADELER
    // =========================================================

    /**
     * if-else if-else zinciri ve switch-case yapisini gosterir.
     */
    public static void kosulluIfadeler() {
        baslik("3. KOSULLU IFADELER");

        // --- if / else if / else ---
        System.out.println("=== Not hesabi (if-else if-else) ===");
        int[] notlar = {95, 82, 74, 61, 45};
        for (int not : notlar) {
            String harf;
            if      (not >= 90) { harf = "AA"; }
            else if (not >= 80) { harf = "BA"; }
            else if (not >= 70) { harf = "BB"; }
            else if (not >= 60) { harf = "CB"; }
            else                { harf = "FF (Basarisiz)"; }
            System.out.printf("  Not: %3d => Harf: %s%n", not, harf);
        }

        // --- switch-case ---
        System.out.println("\n=== Gun adi (switch-case) ===");
        int[] gunler = {1, 3, 6, 7, 9};
        for (int gun : gunler) {
            String gunAdi;
            switch (gun) {
                case 1: gunAdi = "Pazartesi"; break;
                case 2: gunAdi = "Sali";      break;
                case 3: gunAdi = "Carsamba";  break;
                case 4: gunAdi = "Persembe";  break;
                case 5: gunAdi = "Cuma";      break;
                case 6: gunAdi = "Cumartesi"; break;
                case 7: gunAdi = "Pazar";     break;
                default: gunAdi = "Gecersiz gun";
            }
            System.out.println("  Gun " + gun + " => " + gunAdi);
        }
    }

    // =========================================================
    //  BOLUM 4 -- DONGULER
    // =========================================================

    /**
     * for, while, do-while dongulerini; break ve continue anahtar
     * kelimelerini ve ic ice dongu ornegini gosterir.
     */
    public static void donguler() {
        baslik("4. DONGULER");

        // --- for dongusu ---
        System.out.println("=== for: 1-5 arasi toplam ===");
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {          // i++  <=>  i = i + 1
            toplam += i;                          // toplam = toplam + i
            System.out.println("  i=" + i + "  toplam=" + toplam);
        }

        System.out.println("\n=== for (adim=2): cift sayilar ===");
        for (int i = 2; i <= 10; i += 2) {       // i += 2  <=>  i = i + 2
            System.out.print(i + " ");
        }
        System.out.println();

        // --- while dongusu ---
        System.out.println("\n=== while: basamak toplami (sayi=1234) ===");
        int sayi = 1234;
        int basamakToplami = 0;
        while (sayi != 0) {
            basamakToplami += sayi % 10;  // son basamagi al (mod 10)
            sayi /= 10;                   // son basamagi dusu (tam bolme)
        }
        System.out.println("  1234 basamak toplami = " + basamakToplami);  // 1+2+3+4 = 10

        // --- do-while dongusu ---
        System.out.println("\n=== do-while: 1-4 arasi ===");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 4);        // Kosul dongunu SONUNDA kontrol edilir => min 1 kez calisir
        System.out.println();

        // --- break ---
        System.out.println("\n=== break: 6'da dur ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;    // 6'ya gelince dongudan tamamen cik
            System.out.print(i + " ");
        }
        System.out.println("  (6'dan sonrasi yazilmadi)");

        // --- continue ---
        System.out.println("\n=== continue: 3'u atla ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // 3 gelince bu adimi atla, bir sonrakine gec
            System.out.print(i + " ");
        }
        System.out.println("  (3 atlandi)");

        // --- Ic ice for (carpim tablosu) ---
        System.out.println("\n=== Ic ice for: 3x3 carpim tablosu ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("  %d*%d=%-3d", i, j, i * j);
            }
            System.out.println();
        }
    }

    // =========================================================
    //  BOLUM 5 -- DIZILER
    // =========================================================

    /**
     * Tek boyutlu ve iki boyutlu (matris) dizileri gosterir.
     * Arrays.sort(), for-each, toplam, ortalama ve max bulma ornekleri icerir.
     */
    public static void diziler() {
        baslik("5. DIZILER (ARRAYS)");

        // --- Tanimlama yontemleri ---
        int[] dizi1 = new int[5];                 // Bos dizi (varsayilan deger: 0)
        int[] dizi2 = {10, 30, 50, 20, 40};       // Degerlerle birlikte tanimla

        dizi1[0] = 100;   // ilk elemana deger ata  (index 0'dan baslar)
        dizi1[4] = 500;   // son elemana deger ata   (5 elemanli => max index: 4)

        System.out.println("dizi1[0]       = " + dizi1[0]);
        System.out.println("dizi1[4]       = " + dizi1[4]);
        System.out.println("dizi2.length   = " + dizi2.length + "  (eleman sayisi)");

        // --- for dongusuyle yazdirma ---
        System.out.print("\nfor ile dizi2   : ");
        for (int i = 0; i < dizi2.length; i++) {
            System.out.print(dizi2[i] + " ");
        }

        // --- for-each (enhanced for) ---
        System.out.print("\nfor-each dizi2  : ");
        for (int eleman : dizi2) {
            System.out.print(eleman + " ");
        }
        System.out.println();

        // --- Toplam ve ortalama ---
        int sum = 0;
        for (int eleman : dizi2) sum += eleman;
        double ort = (double) sum / dizi2.length;  // (double) cast: int/int = int olmasini onlemek icin
        System.out.printf("Toplam: %d  |  Ortalama: %.1f%n", sum, ort);

        // --- En buyuk eleman ---
        int enBuyuk = dizi2[0];            // Ilk elemani en buyuk kabul et
        for (int eleman : dizi2) {
            if (eleman > enBuyuk) enBuyuk = eleman;  // Daha buyugu var mi?
        }
        System.out.println("En buyuk eleman: " + enBuyuk);

        // --- Siralama: Arrays.sort() ---
        int[] siralanacak = {64, 25, 12, 22, 11};
        System.out.print("\nSiralamadan once : ");
        for (int e : siralanacak) System.out.print(e + " ");

        Arrays.sort(siralanacak);          // Kucukten buyuge siralar (hazir metot)
        System.out.print("\nSiralamadan sonra: ");
        for (int e : siralanacak) System.out.print(e + " ");
        System.out.println();

        // --- 2 Boyutlu dizi (matris) ---
        System.out.println("\n=== 2 Boyutlu Dizi (3x3 Matris) ===");
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.printf("%4d", matris[i][j]);
            }
            System.out.println();
        }
    }

    // =========================================================
    //  BOLUM 6 -- METOTLAR
    // =========================================================

    /**
     * Parametreli, geri donus degerli, void ve overloaded metot orneklerini gosterir.
     * Asagidaki yardimci metotlar sinifin alt kisminda tanimlidir.
     */
    public static void metotlar() {
        baslik("6. METOTLAR");

        // --- Geri donus degeri olan metotlar ---
        System.out.println("topla(8, 5)      = " + topla(8, 5));          // int donus
        System.out.println("faktoriyel(6)    = " + faktoriyel(6));         // long donus => 720
        System.out.println("asalMi(17)       = " + asalMi(17));            // boolean donus => true
        System.out.println("asalMi(18)       = " + asalMi(18));            // boolean donus => false
        System.out.println("kuvvet(2, 10)    = " + kuvvet(2, 10));         // long donus => 1024

        // --- void metot (geri donus degeri yok) ---
        System.out.println("\nYildiz deseni (4 yildiz):");
        yildizYaz(4);

        // --- Overloading: Ayni isim, farkli parametreler ---
        // Java hangi metodu cagiracagini parametre sayisi/tipinden anlar
        System.out.println("\nOverloading ornekleri:");
        System.out.println("topla(int 3, 4)         = " + topla(3, 4));
        System.out.println("topla(int 3, 4, 5)      = " + topla(3, 4, 5));
        System.out.println("topla(double 1.5, 2.5)  = " + topla(1.5, 2.5));
    }

    // =========================================================
    //  BOLUM 7 -- RASTGELE SAYILAR
    // =========================================================

    /**
     * Random sinifiyla rastgele sayi uretimini ve tekrarsiz secimi gosterir.
     */
    public static void rastgeleSayilar() {
        baslik("7. RASTGELE SAYILAR (Random)");

        Random random = new Random();

        int    r1 = random.nextInt(100);          // [0, 100) => 0-99
        int    r2 = random.nextInt(1, 101);        // [1, 101) => 1-100  (Java 17+)
        int    r3 = 1 + random.nextInt(6);         // 1-6 arasi (zar) -- klasik formul
        double r4 = random.nextDouble();           // [0.0, 1.0)

        System.out.println("nextInt(100)     => " + r1 + "  (0-99)");
        System.out.println("nextInt(1, 101)  => " + r2 + "  (1-100)");
        System.out.println("Zar (1-6)        => " + r3);
        System.out.printf ("nextDouble()     => %.4f  (0.0-1.0)%n", r4);

        // Klasik aralik formulu (tum Java surumlerinde calisir):
        // min + random.nextInt(max - min + 1)
        // Ornek: 5-15 arasi => 5 + random.nextInt(11)
        int min = 5, max = 15;
        int aralik = min + random.nextInt(max - min + 1);
        System.out.println("Aralik [5-15]    => " + aralik);

        // --- Tekrarsiz rastgele dizi (Loto mantigi) ---
        System.out.println("\n6 tekrarsiz sayi (1-49 arasi):");
        int[] loto = new int[6];
        int eklenecek = 0;
        while (eklenecek < 6) {
            int aday = 1 + random.nextInt(49);
            boolean tekrar = false;
            for (int i = 0; i < eklenecek; i++) {
                if (loto[i] == aday) { tekrar = true; break; }
            }
            if (!tekrar) { loto[eklenecek] = aday; eklenecek++; }
        }
        Arrays.sort(loto);
        System.out.print("  Loto: ");
        for (int n : loto) System.out.printf("%3d", n);
        System.out.println();
    }

    // =========================================================
    //  BOLUM 8 -- STRING ISLEMLERI
    // =========================================================

    /**
     * String sinifinin sik kullanilan metotlarini gosterir.
     * ONEMLI: String karsilastirmada == kullanilmaz, .equals() kullanilir!
     */
    public static void stringIslemleri() {
        baslik("8. STRING ISLEMLERI");

        String metin = "  Algoritma ve Programlama  ";
        String temiz = metin.trim();   // bas/son boslukları sil

        System.out.println("Orijinal          : \"" + metin + "\"");
        System.out.println("trim()            : \"" + temiz + "\"");
        System.out.println("length()          :  " + temiz.length());
        System.out.println("toUpperCase()     :  " + temiz.toUpperCase());
        System.out.println("toLowerCase()     :  " + temiz.toLowerCase());
        System.out.println("charAt(0)         :  " + temiz.charAt(0));
        System.out.println("indexOf(\'v\')     :  " + temiz.indexOf('v'));
        System.out.println("substring(0,9)    :  " + temiz.substring(0, 9));
        System.out.println("contains(\"Java\"): " + temiz.contains("Java"));
        System.out.println("replace(\'a\',\'@\'): " + temiz.replace('a', '@'));

        // --- String karsilastirma ---
        System.out.println("\n=== String Karsilastirma ===");
        String s1 = "java";
        String s2 = "JAVA";
        System.out.println("equals()           : " + s1.equals(s2));             // false
        System.out.println("equalsIgnoreCase() : " + s1.equalsIgnoreCase(s2));   // true
        System.out.println("UYARI: String icin == kullanma! (referans karsilastirir)");

        // --- Kelime tersini bulma ---
        System.out.println("\n=== Kelime tersini bulma: \"Java\" ===");
        String kelime = "Java";
        StringBuilder ters = new StringBuilder();
        for (int i = kelime.length() - 1; i >= 0; i--) {
            ters.append(kelime.charAt(i));  // i. indexten karakteri al ve ekle
        }
        System.out.println("  \"" + kelime + "\" => \"" + ters + "\"");
    }

    // =========================================================
    //  BOLUM 9 -- KLAVYEDEN GIRDI ALMA (Scanner)
    // =========================================================

    /**
     * Scanner ile kullanicidan veri okumayı gosterir.
     * try-with-resources kullanimi: Scanner otomatik kapatilir.
     */
    public static void klavyedenGirdiAlma() {
        baslik("9. KLAVYEDEN GIRDI ALMA (Scanner)");

        // try-with-resources: try blogu biter bitmez Scanner otomatik kapatilir
        // (manuel scanner.close() cagirmaya gerek kalmaz)
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Adinizi girin        : ");
            String ad = scanner.nextLine();      // tum satiri okur (boslukla birlikte)

            System.out.print("Yasinizi girin       : ");
            int yas = scanner.nextInt();         // tam sayi okur

            System.out.print("Notunuzu girin (0-100): ");
            double not = scanner.nextDouble();   // ondalikli sayi okur

            System.out.println("\n--- Girilen Bilgiler ---");
            System.out.println("Ad   : " + ad);
            System.out.println("Yas  : " + yas);
            System.out.printf ("Not  : %.1f%n", not);

        } // Scanner burada otomatik kapatilir

        // Scanner metotlari ozeti:
        // nextInt()     => int okur
        // nextDouble()  => double okur
        // next()        => bosluga kadar String okur
        // nextLine()    => tum satiri String okur
        // nextBoolean() => true/false okur
    }

    // =========================================================
    //  YARDIMCI METOTLAR
    // =========================================================

    /** Iki tam sayiyi toplar. */
    public static int topla(int a, int b) { return a + b; }

    /** Uc tam sayiyi toplar (overloading). */
    public static int topla(int a, int b, int c) { return a + b + c; }

    /** Iki ondalikli sayiyi toplar (overloading). */
    public static double topla(double a, double b) { return a + b; }

    /**
     * n! (n faktoriyel) hesaplar. Ornek: 5! = 1*2*3*4*5 = 120
     * @param n Faktoriyeli hesaplanacak sayi (n >= 0)
     * @return  n! degeri (long: buyuk sayilar icin)
     */
    public static long faktoriyel(int n) {
        long sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    /**
     * Verilen sayinin asal olup olmadigini kontrol eder.
     * Asal sayi: Sadece 1 ve kendisine tam bolunebilen sayi (2, 3, 5, 7, 11...)
     * Optimizasyon: i'yi sqrt(sayi)'ye kadar test etmek yeterlidir.
     *
     * @param sayi Kontrol edilecek sayi
     * @return Asal ise true, degilse false
     */
    public static boolean asalMi(int sayi) {
        if (sayi < 2) return false;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) return false;  // tam bolunuyor => asal degil
        }
        return true;
    }

    /**
     * taban^us hesaplar (donguyle, Math.pow kullanmadan).
     * @param taban Taban degeri
     * @param us    Us degeri
     * @return      taban^us
     */
    public static long kuvvet(int taban, int us) {
        long sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    /**
     * Verilen sayida yildiz iceren bir satir yazdirir (void metot ornegi).
     * @param adet Yazilacak yildiz sayisi
     */
    public static void yildizYaz(int adet) {
        for (int i = 0; i < adet; i++) System.out.print("* ");
        System.out.println();
    }

    /**
     * Bolum basliklarini tutarli bicimde yazdiran yardimci metot.
     * @param baslikMetni Yazdirilacak baslik metni
     */
    private static void baslik(String baslikMetni) {
        String cizgi = "=".repeat(60);
        System.out.println("\n" + cizgi);
        System.out.println("  " + baslikMetni);
        System.out.println(cizgi);
    }

} // CalismaKagidi sinifi sonu
