import java.util.Random;
import java.util.Scanner;

public class IkiSayiTopla {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bir sayı giriniz:");
        int klavyedengeliceksayi = scn.nextInt();
        int rastgelegeliceksayi = random.nextInt(150);
        int sonuc = sayiTopla(klavyedengeliceksayi, rastgelegeliceksayi);
        System.out.println("toplam: " + sonuc);
    }

    public static int sayiTopla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}