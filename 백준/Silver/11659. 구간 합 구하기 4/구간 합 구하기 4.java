import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] numbers = new int[N];
        int[] sum = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        sum[0] = numbers[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + numbers[i];
        }

        for (int i = 0; i < M; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if (start == 1) {
                System.out.println(sum[end - 1]);
            } else {
                System.out.println(sum[end - 1] - sum[start - 2]);
            }
        }
    }
}
