import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int a = Math.max(A, B);
        int b = Math.min(A, B);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int gcd = a;
        int lcm = (A*B)/gcd;

        System.out.println(gcd + "\n" + lcm);

    }
}