import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] coordinates = new int[N];
        int[] sortedCoordinates = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            sortedCoordinates[i] = coordinates[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedCoordinates);

        Map<Integer, Integer> compressedCoordinates = new HashMap<>();
        for(int s:sortedCoordinates){
            if(!compressedCoordinates.containsKey(s)){
                compressedCoordinates.put(s, compressedCoordinates.size());
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key:coordinates){
            int result = compressedCoordinates.get(key);
            sb.append(result).append(' ');
        }

        System.out.println(sb);
    }
}