import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String words = scanner.next();
            builder.append(words.charAt(0));
            builder.append(words.charAt(words.length() - 1)).append("\n");
        }
        String word = builder.toString();
        System.out.println(word);
    }
}