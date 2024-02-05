import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean palindrome(String txt) {
        int length = txt.length();
        for (int i = 0; i < length / 2; i++) {
            if (txt.charAt(i) != txt.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            if (palindrome(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}