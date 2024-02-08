import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }

        int coinCnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K >= coin[i]) {
                coinCnt += K / coin[i];
                K %= coin[i];
            }
        }

        System.out.println(coinCnt);

    }
}