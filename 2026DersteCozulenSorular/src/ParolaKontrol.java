import java.util.Scanner;

/**
 * Kullanıcının girdiği parolanın uzunluk ve içerik kurallarına uygunluğunu kontrol eder.
 *
 * KURALLAR:
 *  - Uzunluk: 9 ile 12 karakter arasında olmalı (9 ≤ uzunluk < 13)
 *  - Parola boşluk karakteri içermemeli
 *
 * KONULAR:
 *  - String.length() ile uzunluk
 *  - String.contains() ile alt dizgi (substring) arama
 *  - && (VE) ile birden fazla koşulu birleştirme
 *  - İç içe if (nested if)
 *
 * NOT: IO sınıfı ve parametresiz main Java 23+ preview özelliğidir.
 */
public class ParolaKontrol {

    void main() {
        IO.println("Hello World!");
        Scanner scanner = new Scanner(System.in);

        IO.println("Parolanızı giriniz: ");
        String parola = scanner.next();
        int parolaUzunluk = parola.length();

        // Uzunluk 9 ile 12 arasında mı? (9 dahil, 13 hariç)
        if (parolaUzunluk > 8 && parolaUzunluk < 13) {
            IO.println("Parola istenen uzunluktadır");
            IO.println("Parola uzunluğu: " + parolaUzunluk);

            // İç içe if: önce uzunluk kontrolünden geçti, şimdi boşluk kontrolü
            if (parola.contains(" ")) {
                IO.println("Parola boşluk karakteri içeremez.");
            } else {
                IO.println("Parola boşluk karakteri içermiyor.");
            }
        } else {
            IO.println("Parola beklenen değerlerin dışında bir uzunluktadır.");
            IO.println("Parola uzunluğu: " + parolaUzunluk);
        }

        scanner.close();
    }
}
