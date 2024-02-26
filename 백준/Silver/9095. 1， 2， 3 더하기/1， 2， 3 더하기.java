import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int[] dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= n; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }

            sb.append(dp[n]).append('\n');
        }

        System.out.println(sb);
    }
}