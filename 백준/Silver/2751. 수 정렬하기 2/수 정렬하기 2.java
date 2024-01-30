import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            number.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(number);

        for (int num : number) {
            sb.append(num).append('\n');
        }
        
        System.out.println(sb);
    }
}
