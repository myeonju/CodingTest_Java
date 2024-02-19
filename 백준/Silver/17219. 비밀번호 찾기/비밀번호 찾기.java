import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String site = scanner.next();
            String password = scanner.next();
            map.put(site, password);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String site = scanner.next();
            if(map.containsKey(site)){
                sb.append(map.get(site)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
