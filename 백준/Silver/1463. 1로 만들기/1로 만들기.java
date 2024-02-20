import java.util.Scanner;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(operation(N));
    }

    private static int operation(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(operation(N - 1), Math.min(operation(N / 3), operation(N / 2))) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(operation(N / 3), operation(N - 1)) + 1;
            } else if (N % 2 == 0) {
                dp[N] = Math.min(operation(N / 2), operation(N - 1)) + 1;
            } else {
                dp[N] = operation(N - 1) + 1;
            }
        }

        return dp[N];
    }
}
