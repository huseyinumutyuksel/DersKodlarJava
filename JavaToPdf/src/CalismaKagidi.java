// Bu çalışma kağıdı, temel algoritma ve programlama kavramlarını
// Java kod örnekleri ve yorum satırları aracılığıyla açıklamaktadır.
// Sınav sırasında yardımcı kaynak olarak kullanılabilir, doğrudan cevap içermez.
import java.util.Scanner; // Kullanıcıdan girdi almak için
import java.util.Random; // Rastgele sayı üretmek için
// Java Programının Temel Yapısı
public class CalismaKagidi { // Her Java kodu bir sınıf içinde yer alır
    // main metodu: Programın çalışmaya başladığı ana noktadır.
    public static void main(String[] args) {
        // Kodlar main metodu içinde veya buradan çağrılan diğer metotlarda bulunur.
        // Değişkenler: Veriyi saklamak için kullanılan isimlendirilmiş bellek alanlarıdır.
        int yas = 30; // int tipinde 'yas' adında değişken oluştur ve 30 değerini ata
        double fiyat; // double tipinde 'fiyat' adında değişken tanımla
        fiyat = 99.99; // 'fiyat' değişkenine değer ata
        // Sabitler (final): Değeri atandıktan sonra değiştirilemez.
        final double PI = 3.14159; // final anahtar kelimesi ile sabit tanımlanır
        // Aritmetik Operatörler: Matematiksel işlemler için.
        int s1 = 20, s2 = 5;

        int mod = s1 % s2;    // Mod alma (kalan): 0
        // İlişkisel Operatörler: Karşılaştırma yapar, sonuç boolean'dır.
        boolean esitMi = (s1 == s2);       // Eşit mi?: false
        boolean buyukMu = (s1 > s2);       // Büyük mü?: true
        boolean kucukEsitMi = (s1 <= s2);  // Küçük eşit mi?: false
        // Mantıksakal Operatörler: boolean değerler üzerinde mantıksal işlemler yapar.
        boolean kosulA = true;
        boolean kosulB = false;
        boolean sonucVE = kosulA && kosulB;   // VE (AND): false (İkisi de true ise true)
        boolean sonucVEYA = kosulA || kosulB; // VEYA (OR): true (En az biri true ise true)
        boolean sonucDEGIL = !kosulA;         // DEĞİL (NOT): false (Değeri tersine çevirir)
        // Atama Operatörleri: Değişkene değer atar.
        int x = 10;
        x += 5; // x = x + 5; (x şimdi 15)
        x *= 2; // x = x * 2; (x şimdi 30)
        // Ekrana çıktı yazdırma:
        System.out.println("Bu bir satırdır."); // Metni yazdırır ve alt satıra geçer
        System.out.print("Bu aynı satırdadır."); // Metni yazdırır, alt satıra geçmez
        System.out.println(" Devamı.");
        /* Örnek Girdi Alma Kod Bloğu (main içinde veya metotta kullanılabilir)
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturulur
        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine(); // Klavyeden girilen tüm satırı okur
        System.out.print("Yaşınızı girin: ");
        int yasInput = scanner.nextInt(); // Klavyeden girilen tam sayıyı okur
        // next(), nextDouble(), nextBoolean() gibi metotlar da vardır.
        System.out.println("Merhaba " + ad + ", yaşınız: " + yasInput);
        scanner.close(); // Kaynakları serbest bırakmak için Scanner kapatılmalıdır.
        */
        // Koşullu İfadeler: Belirli koşullara göre farklı kod bloklarını çalıştırmak için kullanılır.
        // if / else if / else yapısı:
        int not = 75;
        if (not >= 90) {
            // Eğer not 90 veya üzeriyse bu blok çalışır
            System.out.println("Not: A");
        } else if (not >= 80) {
            // Eğer ilk koşul yanlışsa ve not 80 veya üzeriyse bu blok çalışır
            System.out.println("Not: B");
        } else if (not >= 70) {
            // Önceki koşullar yanlışsa ve not 70 veya üzeriyse bu blok çalışır
            System.out.println("Not: C");
        } else {
            // Yukarıdaki koşulların hiçbiri doğru değilse bu blok çalışır
            System.out.println("Not: D");
        }
        // switch yapısı: Bir değişkenin değerine göre dallanma yapmak için kullanılır.
        int gun = 3;
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break; // switch bloğundan çıkar
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Geçersiz gün");
        }
        // Döngüler: Bir kod bloğunu belirli sayıda veya bir koşul doğru olduğu sürece tekrar çalıştırmak için kullanılır.
        // for döngüsü: Belirli sayıda tekrar için idealdir.
        // for (başlangıç; koşul; adım)
        for (int k = 0; k < 5; k++) {
            // k 0'dan başlar, 5'ten küçük olduğu sürece devam eder, her adımda k 1 artar.
            System.out.println("Döngü Adımı: " + k); // Bu kod 5 kere çalışır (0, 1, 2, 3, 4 için)
        }
        // while döngüsü: Bir koşul doğru olduğu sürece çalışır.
        int sayac = 0;
        while (sayac < 3) {
            // sayac 3'ten küçük olduğu sürece bu blok çalışır.
            System.out.println("While döngüsü: " + sayac);
            sayac++; // Koşulun bir noktada yanlış olması için sayacı artırmalıyız.
        }
        // break: Döngüyü sonlandırır.
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                break; // m 5 olduğunda döngüden çıkılır.
            }
            System.out.println("Break örneği: " + m); // 0, 1, 2, 3, 4 yazılır.
        }
        // continue: Döngünün mevcut adımını atlar, bir sonraki adıma geçer.
        for (int n = 0; n < 5; n++) {
            if (n == 2) {
                continue; // n 2 olduğunda bu adım atlanır, bir sonraki adım (n=3) ile devam eder.
            }
            System.out.println("Continue örneği: " + n); // 0, 1, 3, 4 yazılır.
        }
        // Diziler (Arrays): Aynı veri tipinden birden fazla değeri tek bir değişken altında saklamak için kullanılır.
        // Dizi tanımlama ve oluşturma:
        int[] ogrenciNolar = new int[10]; // 10 elemanlı (0-9 index) int dizisi oluşturur. Default değerler int için 0'dır.
        String[] isimler = {"Ali", "Veli", "Ayşe"}; // 3 elemanlı String dizisi oluşturur ve değerleri atar.
        // Dizi elemanlarına erişme (index kullanarak):
        ogrenciNolar[0] = 101; // Dizinin ilk elemanına (0. index) değer atama.
        String ikinciIsim = isimler[1]; // Dizinin ikinci elemanına (1. index) erişme ("Veli").
        // Dizi boyutu: length özelliği kullanılır (metot değildir).
        int isimSayisi = isimler.length; // isimSayisi şimdi 3 olur.
        // Dizi elemanları üzerinde döngü:
        // Tüm öğrenci numaralarını yazdırma (veya işleme)
        for (int p = 0; p < ogrenciNolar.length; p++) {
            System.out.println(p + ". öğrenci no: " + ogrenciNolar[p]);
        }
        // for-each döngüsü (dizinin tüm elemanlarını sırayla gezer):
        for (String isim : isimler) {
            System.out.println("İsim: " + isim);
        }
        // Çok Boyutlu Diziler (Matrisler): Dizilerin dizisi.
        int[][] matris = new int[3][4]; // 3 satır, 4 sütunlu bir int matrisi oluşturur.
        matris[1][2] = 5; // 1. satırın 2. sütunundaki (indexler 0'dan başlar) elemana değer atama.
        // Rastgele Sayılar: Belirli bir aralıkta tahmin edilemeyen sayılar elde etmek için kullanılır.
        Random random = new Random(); // Rastgele sayı üretmek için Random nesnesi oluşturulur.
        // Rastgele tam sayı üretme:
        int rastgele_0_99 = random.nextInt(100); // 0 (dahil) ile 100 (hariç) arasında rastgele int üretir. (0-99)
        // Belirli bir aralıkta rastgele tam sayı üretme (örn: 1 ile 100 arası dahil)
        // Formül: min + random.nextInt(max - min + 1)
        int min = 1;
        int max = 100;
        int rastgele_1_100 = random.nextInt(max - min + 1) + min; // 1 ile 100 arası bir sayı
        // Rastgele ondalıklı sayı üretme:
        double rastgele_double = random.nextDouble(); // 0.0 (dahil) ile 1.0 (hariç) arasında rastgele double üretir.
        // String İşlemleri: Bir metin (String) içindeki tek tek karakterlere erişme ve işlem yapma.
        String ornekMetin = "Programlama";
        // String'in uzunluğunu alma: length() metodu kullanılır.
        int metinUzunlugu = ornekMetin.length(); // Uzunluk: 11
        // Belirli bir indexteki karaktere erişme: charAt(index) metodu kullanılır. Indexler 0'dan başlar.
        char ilkKarakter = ornekMetin.charAt(0); // 'P' (0. indexteki karakter)
        char besinciKarakter = ornekMetin.charAt(4); // 'r' (4. indexteki karakter)
        char sonkarakter = ornekMetin.charAt(metinUzunlugu - 1); // 'a' (Son karakterin indexi uzunluğun 1 eksiğidir)
        // String üzerinde döngü ile karakter karakter ilerleme:
        for (int q = 0; q < ornekMetin.length(); q++) {
            char mevcutKarakter = ornekMetin.charAt(q); // q. indexteki karakteri al
            // Burada mevcutKarakter üzerinde istenen işlemler yapılabilir.
            // Örneğin: System.out.println(q + ". karakter: " + mevcutKarakter);
        }
        // Karakterleri karşılaştırma: char tipleri '==' operatörü ile karşılaştırılır.
        char k1 = 'a';
        char k2 = 'b';
        boolean esitKarakterler = (k1 == 'a'); // true
    } // main metodu sonu
    /* Örnek Metot Tanımlamaları (main metodunun dışında)
    public static int topla (int sayi1, int sayi2) {
        return sayi1 + sayi2; // İki sayıyı toplar ve sonucu döndürür.
    }
    public static void mesajYaz (String mesaj) {
        System.out.println(mesaj); // Parametre olarak aldığı mesajı ekrana yazar.
    }
    */
} // CalismaKagidi sınıfı sonu