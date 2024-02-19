import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] coordinate = new long[N + 1][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Long.parseLong(st.nextToken());
            coordinate[i][1] = Long.parseLong(st.nextToken());
        }
        coordinate[N] = coordinate[0].clone();

        long sum1 = 0L;
        long sum2 = 0L;

        for (int i = 0; i < N; i++) {
            sum1 += coordinate[i][0] * coordinate[i + 1][1];
            sum2 += coordinate[i][1] * coordinate[i + 1][0];
        }

        System.out.println(String.format("%.1f", Math.abs(sum1 - sum2) / 2D));
    }
}
