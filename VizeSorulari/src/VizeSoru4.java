import java.util.Scanner;
public class VizeSoru4 {
    // İki sayıyı toplayıp sonucu kontrol eden metot
    public static void sayiTopla(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("Sayıların Toplamı: " + toplam);
        if (toplam > 100) {
            System.out.println("Büyük sayı");
        } else {
            System.out.println("Küçük sayı");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int s1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int s2 = scanner.nextInt();
        sayiTopla(s1, s2);
        System.out.println("Test 1:");
        sayiTopla(70, 40); // Toplam 110 (Büyük sayı)
    }
}

