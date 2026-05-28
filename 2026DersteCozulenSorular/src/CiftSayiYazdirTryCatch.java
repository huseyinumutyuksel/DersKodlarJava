import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Kullanıcıdan alınan bir tam sayıya kadar olan çift sayıları yazdırır.
 * try-catch ile hatalı girdileri (harf, ondalıklı sayı) yakalar.
 *
 * KONULAR:
 *  - try - catch ile hata yakalama (exception handling)
 *  - InputMismatchException (Scanner'ın yanlış tip için fırlattığı hata)
 *  - Birden fazla catch bloğu (spesifikten genele sıralanır)
 *  - if (sayi % 2 == 0) ile çift sayı kontrolü
 *
 * static metot özellikleri:
 *  - static → nesne türetmeden çağrılabilir
 *  - public → her yerden erişilebilir
 *  - dönüş tipi int, String, double, boolean veya void olabilir
 *  - main metodu programın başlangıç noktasıdır
 *  - main metot static olmalıdır çünkü program çalıştığında nesne oluşturulmadan çağrılır
 */
public class CiftSayiYazdirTryCatch {

    static void main() {
        try {
            Scanner scanner = new Scanner(System.in);

            // Girilen tam sayıya kadar olan çift sayıları yazdırmak istiyoruz
            System.out.print("Bir tamsayı giriniz: ");
            int sayi = scanner.nextInt();
            scanner.close(); // Sayıyı zaten aldık, kaynağı bırakabiliriz

            ciftSayiYazdir(sayi);

        } catch (InputMismatchException e) {
            // Harf veya ondalıklı sayı girildiyse buraya düşer
            System.out.println("Hata: Harf veya ondalıklı sayı girdiniz! Lütfen tam sayı girin.");
        } catch (Exception e) {
            // Yukarıdaki spesifik hata dışında oluşabilecek diğer her şey
            System.out.println("Bilinmeyen bir hata oluştu: " + e.getMessage());
        }
    }

    /**
     * 1'den verilen sayıya kadar tüm çift sayıları satır satır yazdırır.
     */
    static void ciftSayiYazdir(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) { // mod 2 sıfırsa çift sayıdır
                System.out.println(i);
            }
        }
    }
}
