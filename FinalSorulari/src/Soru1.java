import java.util.Random;
import java.util.Scanner;

/*
 * Bir rastgeleSayiDizisiOlustur adında bir metot yazınız.
 * Bu metot, parametre olarak bir tam sayı (boyut) almalıdır.
 * Metot, verilen boyut kadar elemana sahip bir tam sayı dizisi oluşturmalı ve bu dizinin elemanlarını
 *  1 ile 100 (dahil) arasında rastgele sayılarla doldurmalıdır.
 * Doldurma işleminden sonra, metot oluşturulan bu diziyi ekrana yazdırmalıdır.
 * main metodunuzda kullanıcıdan dizinin boyutunu alınız ve rastgeleSayiDizisiOlustur metodunu çağırarak
 *  çalışmasını gösteriniz. (20 puan) */
public class Soru1 {

    public static void rastgeleSayiDizisiOlustur(int boyut) {
        if (boyut <= 0) {
            System.out.println("Dizi boyutu pozitif bir tamsayı olmalıdır");
            return;
        }
        Random random = new Random();
        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            dizi[i] = random.nextInt(1, 101);
        }
        System.out.print("Oluşturulan Dizi: [");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            if (i < dizi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        rastgeleSayiDizisiOlustur(boyut);
        scanner.close();

    }
}
