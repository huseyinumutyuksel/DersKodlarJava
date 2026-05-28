import java.util.Scanner;

/**
 * Bir e-posta adresini kullanıcı adı ve servis sağlayıcı (domain) olarak ayırır.
 * Yaygın servislerin adını tespit eder (Gmail / Microsoft / Üniversite).
 *
 * KONULAR:
 *  - String metotları: indexOf(), substring(), toLowerCase(), equals()
 *  - if - else if - else zinciri
 *  - Erken çıkış (early return) ile geçersiz girdi kontrolü
 *
 * ÖRNEK GİRDİ - ÇIKTI:
 *   Girdi : ahmet@gmail.com
 *   Çıktı : Kullanıcı Adı: ahmet
 *           Servis Sağlayıcı: gmail.com
 *           Bu bir Google hesabıdır.
 */
public class EmailAyrastir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen email adresinizi giriniz: ");
        String email = scanner.nextLine();
        kullaniciBul(email);
        scanner.close();
    }

    /**
     * E-posta adresini @ işaretine göre parçalayıp servis sağlayıcıyı tespit eder.
     */
    static void kullaniciBul(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex == -1) {
            // @ işareti yoksa geçerli bir e-posta değildir
            System.out.println("Geçersiz email formatı.");
            return; // metoddan erken çık
        }

        // @ işaretinden öncesi kullanıcı adı, sonrası servis sağlayıcı
        String kullaniciAdi = email.substring(0, atIndex);
        System.out.println("Kullanıcı Adı: " + kullaniciAdi);

        // indexOf'a +1 ekleyerek @ işaretini ATLA, sonrasını al
        // Eğer @ işaretini almak istersek +1 yazmamamız gerekir
        String emailServisSaglayici = email.substring(atIndex + 1);
        System.out.println("Servis Sağlayıcı: " + emailServisSaglayici);

        // Karşılaştırmayı küçük harfle yapıyoruz ki büyük/küçük harf farkı sorun olmasın
        String provider = emailServisSaglayici.toLowerCase();
        if (provider.equals("gmail.com")) {
            System.out.println("Bu bir Google hesabıdır.");
        } else if (provider.equals("hotmail.com") || provider.equals("outlook.com")) {
            System.out.println("Bu bir Microsoft hesabıdır.");
        } else if (provider.equals("alanyauniversity.edu.tr")) {
            System.out.println("Bu mail adresi Alanya Üniversitesi hesabıdır.");
        } else {
            System.out.println("Diğer servis sağlayıcı.");
        }
    }
}
