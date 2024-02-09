import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Set<String> unheardSet = new HashSet<>();
        Set<String> unseenSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            unheardSet.add(scanner.next());
        }

        for (int i = 0; i < M; i++) {
            unseenSet.add(scanner.next());
        }

        Set<String> unheardUnseenSet = new TreeSet<>(unheardSet);
        unheardUnseenSet.retainAll(unseenSet);

        System.out.println(unheardUnseenSet.size());
        for (String name : unheardUnseenSet) {
            System.out.println(name);
        }
    }
}
