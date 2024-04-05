import java.util.Scanner;

public class Main {
    static int[] dp = new int[1000001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        System.out.println(Tile(N));
    }

    private static int Tile(int N) {
        if (dp[N] == -1) {
            dp[N] = (Tile(N-1) + Tile(N-2)) % 15746;
        }
        return dp[N];
    }
}
