import java.util.Scanner;

public class Main {
    public static long C;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        C = scanner.nextLong();

        System.out.println(pow(A, B));
    }

    public static long pow(long A, long B) {
        if (B == 1) {
            return A % C;
        }

        long temp = pow(A, B / 2);

        if (B % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        return temp * temp % C;
    }
}
