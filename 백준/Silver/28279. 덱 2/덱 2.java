import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            switch (input){
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case 2:
                    int y = Integer.parseInt(st.nextToken());
                    deque.addLast(y);
                    break;
                case 3:
                    if(deque.isEmpty()){
                        builder.append(-1);
                    }else{
                        builder.append(deque.pollFirst());
                    }
                    builder.append("\n");
                    break;
                case 4:
                    if(deque.isEmpty()){
                        builder.append(-1);
                    } else {
                        builder.append(deque.pollLast());
                    }
                    builder.append("\n");
                    break;
                case 5:
                    builder.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()){
                        builder.append(1);
                    }else {
                        builder.append(0);
                    }
                    builder.append("\n");
                    break;
                case 7:
                    if(deque.isEmpty()){
                        builder.append(-1);
                    }else {
                        builder.append(deque.peekFirst());
                    }
                    builder.append("\n");
                    break;
                case 8:
                    if(deque.isEmpty()){
                        builder.append(-1);
                    }else {
                        builder.append(deque.peekLast());
                    }
                    builder.append("\n");
                    break;
            }
        }
        System.out.println(builder);
    }
}