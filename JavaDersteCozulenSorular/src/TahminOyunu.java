import java.util.Random; //Soruda random sınıfını kullanmak için sınıfı import ediyoruz
import java.util.Scanner;
// İmport dediğimiz işlemde başka bir sınıfı, kütüphaneyi kullanabilmek için onu ekleme

public class TahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        /* Random bir sayı üretebilmek için random sınıfından bir nesne oluşturuyoruz.
        Bu örnekte adına da random dedik değişkenin(nesnenin)
         */
        int n = random.nextInt(1, 21); //20 yi de sayı olarak seçebilmek 21 dedik
        // bound kısmı üst sınır üst sınır değerine ulaşmıyor. Tam sayı olduğu içinde 21 den
        // küçük en büyük tam sayı değeri 20 yi alıyor
        int hak = 5; // Soruda benden bu tanımlamayı yapmamı istemiş

        while (hak > 0) {
            /* sayı değerini klavyeden okuyabilmek için Scanner sınıfını dahil etmem gerekiyor

             */
            System.out.print("Tahmin giriniz:");
            int sayi = scanner.nextInt(); // Döngü içerisinde sayi değerini her dönüşte güncelliyorum
            if (sayi == n) {
                System.out.println("Tebrikler!");
                System.out.println("Şu kadar denemede bildiniz:" + (5 - hak));
                break;
            } else {
                hak--;
                if (n > sayi) {
                    System.out.println("Girilen sayıyı yükselt");
                    System.out.println("Kalan hak sayısı:" + hak);
                } else {
                    System.out.println("Girilen sayıyı küçült");
                    System.out.println("Kalan hak sayısı:" + hak);
                }

            }
        }
        if (hak == 0) {
            System.out.println("Kaybettin");
            System.out.println("Kalan hak sayısı:" + hak);
        }
    }
}
