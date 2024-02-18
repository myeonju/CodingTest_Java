import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (maxX < x) {
                maxX = x;
            }
            if (minX > x) {
                minX = x;
            }
            if (maxY < y) {
                maxY = y;
            }
            if (minY > y) {
                minY = y;
            }
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
