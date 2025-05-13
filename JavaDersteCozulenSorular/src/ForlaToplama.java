import java.util.Scanner;

public class ForlaToplama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Başlangıç değerini alınız:");
        int baslangic = scn.nextInt();
        System.out.println("Bitis değerini alınız:");
        int bitis = scn.nextInt();
        System.out.println("Adım değerini alınız:");
        int adim = scn.nextInt();
        int toplam = 0;
        for (int i = baslangic; i <= bitis; i += adim) {  //i= i+adim
            toplam += i;  //toplam= toplam+i
            System.out.println("Toplam değeri:" + toplam);
        }
        System.out.println("Toplam değeri:" + toplam);

    }
}
//i++  i=i+1
// for döngüde for(int i=0;i < 10;i++) {   }
