import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] k = new int[N];

        for (int i = 0; i < N; i++) {
            k[i] = scanner.nextInt();
        }

        Arrays.sort(k);

        int maxW = 0;

        for (int i = 0; i < k.length; i++) {
            int currentWeight = k[i] * (k.length - i);
            if (maxW < currentWeight) {
                maxW = currentWeight;
            }
        }

        System.out.println(maxW);
    }
}
