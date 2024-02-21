import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                scanner.next();
                String type = scanner.next();

                if (map.containsKey(type)) {
                    map.put(type, map.get(type) + 1);
                } else {
                    map.put(type, 1);
                }
            }

            int result = 1;

            for (int val : map.values()) {
                result *= (val + 1);
            }

            System.out.println(result - 1);
        }
    }
}
