import java.util.Scanner;

public class Main {
    static long[] dp = new long[101];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(P(N));
        }
    }

    private static long P(int N) {
        if (N <= 3) {
            return 1;
        }
        if (N == 4 || N == 5) {
            return 2;
        }
        if (dp[N] != 0) {
            return dp[N];
        }
        dp[N] = P(N - 1) + P(N - 5);
        return dp[N];
    }
}
