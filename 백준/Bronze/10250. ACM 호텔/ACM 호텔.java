import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int floor = N % H;
            if (floor == 0) {
                floor = H;
            }

            int room = (N - 1) / H + 1;
            int roomNum = room + floor * 100;
            System.out.println(roomNum);
        }
    }
}
