import java.util.Scanner;

public class Main {
    static int cnt1, cnt2;
    static int[] f;

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < n; i++) {
            cnt2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        f = new int[n];

        cnt1 = 0;
        cnt2 = 0;

        fib(n);
        fibonacci(n);

        System.out.println(cnt1 + " " + cnt2);
    }
}