import java.util.*;

public class Main {
    static int[] arr;
    static boolean[] duplication;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        duplication = new boolean[N+1];

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++) {
            if(!duplication[i]) {
                duplication[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                duplication[i] = false;
            }
        }
    }
}