import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(factorial(N));
    }

    private static long factorial(long N) {
        if (N == 0) {
            return 1;
        }
        if (N > 1) {
            N = N * (factorial(N - 1));
        } else {
            N = N * 1;
        }
        return N;
    }
}