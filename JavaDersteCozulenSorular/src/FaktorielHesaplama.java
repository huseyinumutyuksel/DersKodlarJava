import java.util.Scanner;

public class FaktorielHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt();
        //Çalışabilmesi için main metodunda fonksiyonu çağırıyorum
        int sonuc = faktorielHesapla(sayi);
        System.out.println("Faktöriel hesabının sonucu:" + sonuc);
    }

    public static int faktorielHesapla(int sayi) {
        int sonuc = 1;
        for (int i = sayi; i > 1; i--) {
            sonuc *= i;
        }
        return sonuc;
    }
}
