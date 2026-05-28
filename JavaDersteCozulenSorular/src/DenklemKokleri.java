import java.util.Scanner;

public class DenklemKokleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A katsayısını giriniz:");
        double a = scanner.nextDouble();
        System.out.println("B katsayısını giriniz:");
        double b = scanner.nextDouble();
        System.out.println("C katsayısını giriniz:");
        double c = scanner.nextDouble();
        // Diskriminant hesaplamam gerekiyor formülü D= b*b -4*a*c
        double diskriminant = b * b - 4 * a * c;
        //Diskriminant değerinin 0 dan büyük olup olmadığına göre karar vermem gerek
        if (diskriminant > 0) {
            // Burada kök hesaplayacağım
            double kok1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
            double kok2 = (-b - Math.sqrt(diskriminant)) / 2 * a;
            System.out.println("Birinci kök değerim:" + kok1);
            System.out.println("Birinci kök değerim:" + kok2);
        } else if (diskriminant == 0) {
            // Yine kök hesaplayacağım kökler eşit
            double kok1 = (-b + Math.sqrt(diskriminant)) / 2 * a;
            System.out.println("Birinci kök değerim:" + kok1);
        } else {
            //Reel kök yok hata- uyarı mesajı vereceğim
            System.out.println("Reel kök değeri yoktur");
        }
    }
}
