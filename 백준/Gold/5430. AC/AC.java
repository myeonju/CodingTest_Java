import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st;

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            String P = scanner.next();
            int n = scanner.nextInt();

            st = new StringTokenizer(scanner.next(), "[],");

            for (int j = 0; j < n; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(P, deque);
        }

        System.out.println(sb);

    }

    private static void AC(String P, ArrayDeque<Integer> deque) {

        boolean forward = true;

        for (char p : P.toCharArray()) {

            if (p == 'R') {
                forward = !forward;
                continue;
            }

            if (forward) {

                if (deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }

            } else {
                if (deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }

        result(deque, forward);

    }

    private static void result(ArrayDeque<Integer> deque, boolean forward) {

        sb.append('[');

        if (!deque.isEmpty()) {

            if (forward) {

                sb.append(deque.pollFirst());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());

                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }

        sb.append(']').append('\n');
    }
}
