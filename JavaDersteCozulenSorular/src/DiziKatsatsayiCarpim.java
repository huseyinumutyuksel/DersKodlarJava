import java.util.Scanner;

public class DiziKatsatsayiCarpim {
    public static void main(String[] args) {
        //Bir dizi tanımlayalım ve klavyeden gelen bir k katsayısı ile sayıyı çarpalım
        //Dizinin boyutunu da klavyeden alalım
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz:");
        int n = scanner.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin" + i + 1 + "inci elamanını giriniz:");
            dizi[i] = scanner.nextInt();
        }
        System.out.print("k sayısı giriniz:");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            dizi[i] *= k;
            System.out.print("Dizinin elemanları " + dizi[i]);
        }

    }
}
