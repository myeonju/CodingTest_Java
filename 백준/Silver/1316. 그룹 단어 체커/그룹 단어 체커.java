import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = ' ';

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current != prev) {
                if (seen[current - 'a']) {
                    return false;
                }
                seen[current - 'a'] = true;
            }
            prev = current;
        }
        return true;
    }
}
