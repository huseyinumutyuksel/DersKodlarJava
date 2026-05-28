import java.util.Scanner;
public class VizeSoru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elemanSayisi = 5;
        int[] dizi = new int[elemanSayisi]; // 5 elemanlı tamsayı dizisi
        int toplam = 0;
        System.out.println(elemanSayisi + " adet tam sayı giriniz:");
        // Kullanıcıdan 5 sayı alıp diziye ekleme ve toplama
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
            toplam += dizi[i]; // Girilen sayıyı toplama ekle
        }
        // Ortalamayı hesaplama (Doğru sonuç için double bölme)
        double ortalama = (double) toplam / dizi.length;
        System.out.println("Dizinin Ortalaması: " + ortalama);
        scanner.close(); // Scanner nesnesini kapat
    }
}

