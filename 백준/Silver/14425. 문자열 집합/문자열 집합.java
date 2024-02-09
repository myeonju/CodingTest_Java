import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(scanner.next(), 0);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (map.containsKey(scanner.next())) {
                count++;
            }
        }

        System.out.println(count);
    }
}