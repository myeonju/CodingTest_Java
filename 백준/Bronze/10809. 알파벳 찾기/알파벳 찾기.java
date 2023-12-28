import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                if (positions[ch - 'a'] == -1) {
                    positions[ch - 'a'] = i;
                }
            }
        }

        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
}