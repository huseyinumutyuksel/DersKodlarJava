import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Yüksekliği giriniz:");
        double yukseklik = scanner.nextDouble();
        System.out.println(" Taban uzunluğunu giriniz:");
        double taban = scanner.nextDouble();
        double alan = (taban * yukseklik) / 2;
        System.out.println(" Alan:" + alan);
    }
}
