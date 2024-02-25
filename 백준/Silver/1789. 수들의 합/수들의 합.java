import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long S = scanner.nextLong();

        long sum = 0;
        long N = 1;

        while (sum <= S) {
            sum += N;
            N++;
        }

        System.out.println(N - 2);
    }
}
