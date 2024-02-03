import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> balloon  = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            balloon.add(new int[] {(i+1), arr[i]});
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1 ");
        int num = arr[0];

        while(!balloon.isEmpty()) {
            if(num >0) {
                for(int i=1; i<num; i++) {
                    balloon.add(balloon.poll());
                }

                int[] idx = balloon.poll();
                num = idx[1];
                sb.append(idx[0]+" ");
            }
            else {
                for(int i=1; i<-num; i++) {
                    balloon .addFirst(balloon.pollLast());
                }

                int[] idx = balloon.pollLast();
                num = idx[1];
                sb.append(idx[0]+" ");
            }
        }

        System.out.println(sb);

    }
}