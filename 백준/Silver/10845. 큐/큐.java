import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        Deque<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            String input = scanner.next();
            switch (input){
                case "push":
                    deque.add(scanner.nextInt());
                    break;
                case "pop":
                    if(deque.isEmpty()){
                        sb.append(-1);
                    } else{
                        sb.append(deque.poll());
                    }
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        sb.append(1);
                    } else{
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "front":
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else {
                        sb.append(deque.peekFirst());
                    }
                    sb.append("\n");
                    break;
                case "back":
                    if(deque.isEmpty()){
                        sb.append(-1);
                    }else {
                        sb.append(deque.peekLast());
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}