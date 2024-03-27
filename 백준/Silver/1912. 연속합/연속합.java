import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        dp[0] = num[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + num[i], num[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
