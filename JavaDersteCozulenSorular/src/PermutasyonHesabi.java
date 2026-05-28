import java.util.Scanner;

public class PermutasyonHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt();
        System.out.println("r sayısını giriniz:");
        int r = scanner.nextInt();
        //Çalışabilmesi için main metodunda fonksiyonu çağırıyorum
        int ust = faktorielHesapla(sayi);
        int alt = faktorielHesapla((sayi - r));
        System.out.println("Permütasyon hesabının sonucu:" + (double) (ust / alt));
    }

    public static int faktorielHesapla(int sayi) {
        int sonuc = 1;
        for (int i = sayi; i > 1; i--) {
            sonuc *= i;
        }
        return sonuc;
    }
}
