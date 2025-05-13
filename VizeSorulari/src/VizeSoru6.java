public class VizeSoru6 {
    /*Java'da dizi, belirli bir türdeki sabit sayıda öğeyi depolayan bir veri yapısıdır.
    veriTipi[] diziAdi; (Deklarasyon)
    diziAdi = new veriTipi[elemanSayisi]; (Oluşturma/Boyutlandırma)
    veriTipi[] diziAdi = new veriTipi[elemanSayisi]; (Deklarasyon ve Oluşturma Birleşik)
    veriTipi[] diziAdi = {deger1, deger2, ...}; (Başlangıç değerleriyle oluşturma) */
        public static void main(String[] args) {
            // 2. Yöntem: Başlangıç değerleriyle direkt oluşturma (Daha pratik)
            int[] sayilar = {11, 22, 33, 44, 55}; // 5 elemanlı int dizisi
            System.out.println("Dizinin elemanları:");
            // Dizinin elemanlarını for döngüsü ile yazdırma
            for (int i = 0; i < sayilar.length; i++) {
                System.out.println("Dizi[" + i + "] = " + sayilar[i]);
            }
        }
    }

