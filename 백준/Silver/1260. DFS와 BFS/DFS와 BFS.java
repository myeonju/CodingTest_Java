import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visitedDFS;
    static boolean[] visitedBFS;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());

        visitedDFS = new boolean[N + 1];
        visitedBFS = new boolean[N + 1];

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
            Collections.sort(graph.get(i));
        }

        dfs(R);
        System.out.println();
        bfs(R);
    }

    private static void dfs(int node) {
        visitedDFS[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if (!visitedDFS[newNode]) {
                dfs(newNode);
            }
        }
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visitedBFS[node] = true;

        while (!queue.isEmpty()) {
            int num = queue.poll();
            System.out.print(num + " ");
            for (int i = 0; i < graph.get(num).size(); i++) {
                int newNode = graph.get(num).get(i);
                if (!visitedBFS[newNode]) {
                    queue.add(newNode);
                    visitedBFS[newNode] = true;
                }
            }
        }
    }
}
