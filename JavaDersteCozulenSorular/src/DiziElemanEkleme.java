import java.util.Scanner;

public class DiziElemanEkleme {
    public static void main(String[] args) {
        int[] dizi = new int[5]; //10 elemanlı int dizisi tanımladık
        Scanner cilek = new Scanner(System.in);
        //scanner veya scn mantıklı olduğu için değişken ismi yapıyoruz.Herhangi bir isim olabilir
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " dizi elemanını giriniz:");
            dizi[i] = cilek.nextInt();
        }
        //Dizinin elemanlarını sırayla ekrana yazdırıyoruz
        for (int i = 0; i < dizi.length; i++) {  //length özelliği uzunluk değerinin bilgisini veriyor
            System.out.println(dizi[i]);
        }

    }
}
