import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = num[i] + num[j] + num[k];
                    if (temp <= M && temp > result) {
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);

    }
}