
import java.util.Scanner;
public class VizeSoru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Kullanıcıdan giriş almak için Scanner nesnesi */
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(); // Kullanıcıdan tam sayı girdisi al
        if (sayi > 0) {
            System.out.println("Girilen sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Girilen sayı negatiftir.");
        } else {
            System.out.println("Girilen sayı sıfırdır.");
        }
        scanner.close(); // Scanner nesnesini kapat
    }
}

