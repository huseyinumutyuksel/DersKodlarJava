/**
 * 2 boyutlu (jagged - düzensiz) bir dizinin elemanlarını yazdırır.
 *
 * KONULAR:
 *  - 2 boyutlu dizi (matris) tanımlama
 *  - Jagged dizi (her satırın uzunluğu farklı olabilir)
 *  - İç içe for döngüleri (nested for)
 *  - myNumbers[row].length ile her satırın uzunluğunu alma
 *
 * NOT: Bu örnekteki main metodu parametre almamaktadır.
 *      Java 21+ "instance/static main" preview özelliği kullanılmaktadır.
 *      JDK 23 (preview) gerekir.
 */
public class IkiBoyutluDizi {

    static void main() {
        // Jagged dizi: 1. satırda 3, 2. satırda 5 eleman var
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        // Dış döngü: satırları gezer
        for (int row = 0; row < myNumbers.length; row++) {
            // İç döngü: o satırdaki sütunları gezer
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }
    }
}
