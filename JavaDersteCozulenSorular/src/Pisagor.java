import java.util.Scanner;

public class Pisagor {
    public static void main(String[] args) {
        /* Klavyeden iki dikkenar uzunluğu verilen üçgenin
        hipotenüs uzunluğunu Pisagor teoremi ile hesaplayalım
         Pisagor teoremi iki kenarın kareleri toplamı üçüncü kenarın karesine eşittir.
         */
        /* Bu sorunun çözümünü yapalım */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Dik kenar uzunluğunu giriniz:");
        double kenar1 = scanner.nextDouble();
        System.out.println(" Dik kenar uzunluğunu giriniz:");
        double kenar2 = scanner.nextDouble();
        double kenar3 = 0;
        kenar3 = Math.sqrt(((kenar1 * kenar1) + (kenar2 * kenar2)));
        System.out.println("Hipotenüs teoremine göre kenar değeri:" + kenar3);
    }
}
