import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> reverseMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String pokemon = scanner.next();
            map.put(pokemon, i + 1);
            reverseMap.put(i + 1, pokemon);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String question = scanner.next();
            if (Character.isDigit(question.charAt(0))) {
                int pokemonNumber = Integer.parseInt(question);
                sb.append(reverseMap.get(pokemonNumber)).append("\n");
            } else {
                sb.append(map.get(question)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
