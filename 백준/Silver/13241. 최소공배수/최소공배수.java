import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long A = scanner.nextLong();
        Long B = scanner.nextLong();

        Long a = max(A, B);
        Long b = min(A, B);

        while (b != 0) {
            Long temp = a % b;
            a = b;
            b = temp;
        }

        Long gcd = a;
        Long lcm = (A * B) / gcd;

        System.out.println(lcm);
    }
}