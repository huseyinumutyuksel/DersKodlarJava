import java.util.Scanner;

/**
 * Bir futbolcunun isabetli pas yüzdesini hesaplayan program.
 * BolmeMetodu sınıfındaki yuzdeHesabi() metodunu kullanır.
 *
 * KONULAR:
 *  - Scanner ile veri okuma
 *  - Başka sınıftaki static metot çağrısı (ClassName.metot())
 *  - Yüzde hesabı
 *
 * ÖRNEK:
 *  Toplam pas: 50,  İsabetli pas: 35  →  İsabetli pas yüzdesi: 70.0%
 */
public class IsabetliPasYuzdesi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Toplam pas sayısını giriniz: ");
        int pasSayisi = scn.nextInt();

        System.out.print("İsabetli pas sayısını giriniz: ");
        int isabetliPasSayisi = scn.nextInt();

        // BolmeMetodu sınıfından yardımcı metodu çağırıyoruz
        double isabetliPasYuzdesi = BolmeMetodu.yuzdeHesabi(pasSayisi, isabetliPasSayisi);

        System.out.println("İsabetli pas yüzdesi: " + isabetliPasYuzdesi + "%");

        scn.close(); // Scanner kaynağını serbest bırak
    }
}
