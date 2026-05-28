import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DizideArama {
    public static void main(String[] args) {
        /* Dizide arama işlemi yapacağız. Bunun için rastgale elemanlar içeren bir dizi oluşturalım.
         * Bu dizi içerisinde istediğimiz bir değerin olup olmadığını sorgulayalım */
        Scanner scanner = new Scanner(System.in); //Klasik scanner tanımlaması yapıyoruz.
        boolean bulundu = false;
        System.out.println("Dizi boyutunu giriniz:");
        int diziBoyutu = scanner.nextInt();
        System.out.println("Dizi içerisinde aramak istediğiniz sayı değerini giriniz:");
        int arananDeger = scanner.nextInt(); //Aranacak değeri klavyeden okuduk
        // Şimdi rastgale değerler içeren bir dizi oluşturalım
        Random random = new Random(); // Scannerda olduğu gibi random nesnesi oluşturuyoruz.
        // Random u rastgele sayı değeri üretmek için kullanıyoruz
        int[] dizi = new int[diziBoyutu]; // Klavyeden dizi boyutu değerini aldık
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = random.nextInt(1000);
            // Her seferin i. indisli dizi değerine 0 -99 arası bir değer veriyoruz
        }
        // Arama işlemini kolaylaştırmak için diziyi sıralayalım bunun için hazır olan sort methodu kullanalım
        Arrays.sort(dizi); // sort yani sıralama işlemini dizinin üzerinde yapacak
        // Elimde küçükten büyüğe sıralanmış bir dizi olduğunu biliyorum
        if (dizi[diziBoyutu / 2] > arananDeger) {
            for (int i = 0; i < diziBoyutu / 2; i++) {
                if (arananDeger == dizi[i]) {
                    bulundu = true;
                    break;
                }
            }
        } else {
            for (int i = (diziBoyutu / 2) - 1; i < diziBoyutu; i++) {
                if (arananDeger == dizi[i]) {
                    bulundu = true;
                    break;
                }
            }
        }
        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print(dizi[i] + " ");
        }
        if (bulundu) {
            System.out.println("Deger bulundu.");
        } else {
            System.out.println("Deger bulunmadı.");
        }
    }
}
