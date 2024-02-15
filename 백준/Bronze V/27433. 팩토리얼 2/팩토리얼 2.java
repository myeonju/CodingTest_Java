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
        else {
            return N * factorial(N-1);
        }
    }
}