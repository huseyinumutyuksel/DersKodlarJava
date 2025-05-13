import java.util.Scanner;

public class TabanUstAlma {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Taban değerini giriniz:");
        int taban = scn.nextInt();
        System.out.println("Üst değerini giriniz:");
        int ust = scn.nextInt();
        int sonuc = taban;
        for (int i = 1; i < ust; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuc değeri:" + sonuc);
        // Soruyu direk math pow ile çözersek
        double sonucPow = Math.pow(taban, ust);
        System.out.println(" Pow metodu ile sonuc değeri:" + sonucPow);
    }
}


