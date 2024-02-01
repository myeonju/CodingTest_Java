import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i); 
        }

        StringBuilder josephusSequence = new StringBuilder("<");
        int count = 0;

        while (!queue.isEmpty()) {
            int person = queue.poll(); 
            count++;

            if (count == K) {
                josephusSequence.append(person).append(", "); 
                count = 0;
            } else {
                queue.add(person); 
            }
        }

        josephusSequence.setLength(josephusSequence.length() - 2);
        josephusSequence.append(">");

        System.out.println(josephusSequence); 
    }
}