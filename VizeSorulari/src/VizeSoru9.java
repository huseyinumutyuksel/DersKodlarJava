public class VizeSoru9 {
    public static void main(String[] args) {
        // Örnek bir dizi (İstenirse kullanıcıdan da alınabilir)
        int[] dizi = {45, 12, 89, 23, 56, 9, 77};
        // İlk elemanı başlangıçta en küçük kabul et
        int enKucuk = dizi[0];
        // Dizinin geri kalanını tarayarak daha küçük bir eleman ara
        // Döngü 1. indexten başlar çünkü 0. index zaten enKucuk'e atandı
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i]; // Daha küçük bir eleman bulunursa güncelle
            }
        }
        System.out.println("Dizideki en küçük eleman: " + enKucuk);
    }
}