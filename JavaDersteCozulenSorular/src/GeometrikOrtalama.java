import java.util.Scanner;

public class GeometrikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz.Çıkmak için 0 giriniz:");
        double sayi = scanner.nextDouble();
        double carpım = 1;
        int sayac = 0;
        while (sayi != 0) {
            carpım *= sayi;
            sayac++;
            System.out.println("Sayı giriniz.Çıkmak için 0 giriniz:");
            sayi = scanner.nextDouble();
            if (sayi != 0) {
                carpım *= sayi;
                sayac++;
                System.out.println("Sayı giriniz.Çıkmak için 0 giriniz:");
                sayi = scanner.nextDouble();
            }
        }
        double ortalama = Math.pow(carpım, 1.0 / (double) sayac);
        System.out.println(+sayac + "kadar sayının geometrik ortalaması:" + ortalama);
    }
}
