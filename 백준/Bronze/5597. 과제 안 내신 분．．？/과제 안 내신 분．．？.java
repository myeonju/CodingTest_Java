import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] n = new int[28];

        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }

        Arrays.sort(n);
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 1; i <= 30; i++) {
            if (j < 28 && n[j] == i) {
                j++;
            } else{
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);

    }
}
