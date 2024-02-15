import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append(x).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(x);
            }
        }

        System.out.println(sb);
    }
}