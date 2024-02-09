import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<A; i++){
            set.add(scanner.nextInt());
        }

        for(int i=0; i<B; i++){
            int numberB = scanner.nextInt();
            if(set.contains(numberB)){
                set.remove(numberB);
            } else{
                set.add(numberB);
            }
        }

        System.out.println(set.size());

    }
}
