import java.util.Random;

public class SayisalLoto {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int[] loto = new int[6];
        Random random = new Random();
        while (i < 6) {
            int n = random.nextInt(50);
            for (j = 0; j < 6; j++) {
                if (loto[j] == n) {
                    break;
                }
            }
            if (j == 6) {
                loto[i] = n;
                i++;
            }
        }
        for (i = 0; i < 6; i++) {
            System.out.print(+loto[i] + "\t");
        }
    }
}
