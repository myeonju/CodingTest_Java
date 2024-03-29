import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> deque = new LinkedList<>();

        int N = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String input = scanner.next();

            switch (input) {
                case "push_front":
                    deque.addFirst(scanner.nextInt());
                    break;
                case "push_back":
                    deque.addLast(scanner.nextInt());
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    sb.append("\n");
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.pollLast());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekFirst());
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(deque.peekLast());
                    }
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}