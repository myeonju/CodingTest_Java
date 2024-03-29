import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }

        dp[0] = score[0];
        if (n > 1) {
            dp[1] = score[0] + score[1];
        }
        if (n > 2) {
            dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);
        }

        for (int i = 3; i < n; i++) {
            dp[i] = score[i] + Math.max(dp[i - 2], dp[i - 3] + score[i - 1]);
        }

        System.out.println(dp[n-1]);
    }
}
