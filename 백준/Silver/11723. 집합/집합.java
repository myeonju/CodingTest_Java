import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int bit = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String operation = scanner.next();
            int x;

            switch (operation) {
                case "add":
                    x = scanner.nextInt();
                    bit |= (1 << (x - 1));
                    break;
                case "remove":
                    x = scanner.nextInt();
                    bit = bit & ~(1 << (x - 1));
                    break;
                case "check":
                    x = scanner.nextInt();
                    sb.append((bit & (1 << (x - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    x = scanner.nextInt();
                    bit ^= (1 << (x - 1));
                    break;
                case "all":
                    bit |= (~0);
                    break;
                case "empty":
                    bit &= 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}
