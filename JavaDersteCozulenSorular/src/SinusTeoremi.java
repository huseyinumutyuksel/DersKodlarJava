import java.util.Scanner;

public class SinusTeoremi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar uzunluğunu giriniz:");
        double kenar1 = scanner.nextDouble();
        System.out.println("Kenar uzunluğunu giriniz:");
        double kenar2 = scanner.nextDouble();
        System.out.println("Kenarlar arası açı değerini giriniz:");
        double aci = scanner.nextDouble();
        double alan = kenar1 * kenar2 * Math.sin(aci) / 2;
        System.out.println("Alan değeri:" + alan);
    }
}
