public class VizeSoru8 {
    public static void main(String[] args) {
        System.out.println("1'den 10'a kadar olan sayıların kareleri:");
        // for döngüsü ile 1'den 10'a kadar ilerle
        for (int i = 1; i <= 10; i++) {
            int kare = i * i; // Sayının karesini hesapla
            System.out.println(i + " sayısının karesi: " + kare);
        }
    }
}