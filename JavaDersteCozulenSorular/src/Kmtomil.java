import java.util.Scanner;

public class Kmtomil {
    public static void main(String[] args) {
        /* Km olarak klavyeden aldığım değeri mile çevireceğim */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilometre değerini giriniz:");
        double km = scanner.nextDouble();
        double milDonusum = 0.621;
        double mil = km * milDonusum;
        System.out.println("Mil değerini şudur:" + mil);
        scanner.close();
    }
}
