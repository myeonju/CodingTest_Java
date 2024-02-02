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
            String input = st.nextToken();

            switch (input){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    deque.add(x);
                    break;
                case "pop":
                    if(deque.isEmpty()){
                        builder.append(-1);
                    }else{
                        builder.append(deque.poll());
                    }
                    builder.append("\n");
                    break;
                case "size":
                    builder.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        builder.append(1);
                    } else {
                        builder.append(0);
                    }
                    builder.append("\n");
                    break;
                case "front":
                    if(deque.isEmpty()){
                        builder.append(-1);
                    }else {
                        builder.append(deque.peek());
                    }
                    builder.append("\n");
                    break;
                case "back":
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