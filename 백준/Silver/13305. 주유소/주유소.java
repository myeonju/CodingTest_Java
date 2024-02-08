import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] Km = new int[N - 1];
        int[] L = new int[N];

        for (int i = 0; i < N - 1; i++) {
            Km[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
        }

        long expense = 0;
        long minL = L[0];

        for (int i = 0; i < N - 1; i++) {
            if (L[i] < minL) {
                minL = L[i];
            }
            expense += (minL * Km[i]);
        }

        System.out.println(expense);

    }
}