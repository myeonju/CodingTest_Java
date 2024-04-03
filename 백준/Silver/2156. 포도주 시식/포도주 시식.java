import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] amount = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            amount[i] = scanner.nextInt();
        }

        dp[0] = amount[0];
        if (N > 1) {
            dp[1] = amount[0] + amount[1];
        }
        if (N > 2) {
            dp[2] = Math.max(Math.max(amount[0] + amount[2], amount[1] + amount[2]), amount[0] + amount[1]);
        }
        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + amount[i], dp[i-3] + amount[i-1] + amount[i]));

        }

        if (N >= 3) {
            System.out.println(Math.max(dp[N - 1], Math.max(dp[N - 2], dp[N - 3])));
        } else {
            System.out.println(dp[N - 1]);
        }


    }
}
