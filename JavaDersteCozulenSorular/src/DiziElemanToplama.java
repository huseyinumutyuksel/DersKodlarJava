public class DiziElemanToplama {
    public static void main(String[] args) {
        int[] dizi = {5, 14, 9, 23, 34};
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        System.out.println("Toplam değeri:" + toplam);
    }
}
