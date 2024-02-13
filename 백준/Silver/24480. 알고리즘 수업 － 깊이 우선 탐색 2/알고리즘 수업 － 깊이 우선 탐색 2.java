import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int cnt;
    static int[] checked;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stringTokenizer;

        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());

        checked = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        cnt = 1;
        dfs(R);

        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }
        System.out.println(sb);

    }

    private static void dfs(int node) {

        checked[node] = cnt;

        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if (checked[newNode] == 0) {
                cnt++;
                dfs(newNode);
            }
        }

    }
}