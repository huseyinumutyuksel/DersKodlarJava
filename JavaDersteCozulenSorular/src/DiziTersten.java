import java.util.Scanner;

public class DiziTersten {
    public static void main(String[] args) {
        //Bir diziyi tersten yazdıralım.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dizi = new int[n];  //n elemanlı bir dizi tanımladım.
        for (int i = 0; i < n; i++) {  //n elemanlı diziyi 1 den n kadar elemanlarla doldurdum.
            dizi[i] = i + 1;
        }
        //Bu diziyi tersten yazmak için aynı boyutta geçici bir dizi tanımlayalım
        int[] diziTemp = new int[dizi.length]; //n sayısını da yazabilirim dizi.lenght de yazabilirim
        for (int i = 0; i < dizi.length; i++) {
            diziTemp[i] = dizi[dizi.length - 1 - i]; //bu döngüde diziTemp içerisine ters elemanları yazdım
        }
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = diziTemp[i];
            System.out.print(dizi[i] + "\t");
        }
    }
}
