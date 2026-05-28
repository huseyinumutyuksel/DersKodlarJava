import java.util.Scanner;
public class VizeSoru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam alışveriş tutarını giriniz (TL): ");
        double toplamTutar = scanner.nextDouble();
        double odenecekTutar;
        // İndirim koşullarını kontrol et ve ödenecek tutarı hesapla
        if (toplamTutar < 100) {
            odenecekTutar = toplamTutar; // %0 indirim (indirim yok)
        } else if (toplamTutar <= 500) { // 100 TL dahil, 500 TL dahil
            odenecekTutar = toplamTutar * 0.95; // %5 indirim (%100 - %5 = %95)
        } else { // 500 TL'den fazla
            odenecekTutar = toplamTutar * 0.90; // %10 indirim (%100 - %10 = %90)
        }
        // Sadece sonucu yazdır
        System.out.println("Ödenecek Tutar: " + odenecekTutar+ " TL");
        scanner.close();
    }
}
