import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        dp[0][0] = arr[0][0];

        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                } else if(j == i) {
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
            }
        }

        int max = 0;
        for(int j=0; j<n; j++){
            if(max < dp[n-1][j]){
                max = dp[n-1][j];
            }
        }

        System.out.println(max);
    }
}
