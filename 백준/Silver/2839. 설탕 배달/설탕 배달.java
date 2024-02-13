import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        if (N == 4 || N == 7) {
            count = -1;
        } else if (N % 5 == 0) {
            count += N / 5;
        } else if (N % 5 == 1 || N % 5 == 3) {
            count += (N / 5) + 1;
        } else if (N % 5 == 2 || N % 5 == 4) {
            count += N / 5 + 2;
        }

        System.out.println(count);
    }
}