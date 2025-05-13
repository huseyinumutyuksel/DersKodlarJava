import java.util.Scanner;

public class SayiTersten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt(); // Klavyeden girilen sayıyı okuduk
        while (sayi != 0) {
            System.out.print(sayi % 10);
            sayi /= 10;
        }
    }
}
