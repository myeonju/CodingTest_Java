import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int c = Math.max(Math.max(A, B), C);
            int a = Math.min(Math.min(A, B), C);
            int b = A + B + C - a - c;

            if (A == 0 && B == 0 && C == 0) {
                break;
            }
            if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }


    }
}