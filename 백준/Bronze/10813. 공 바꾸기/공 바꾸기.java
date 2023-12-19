import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        for(int change=0; change<M; change++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }
        
        for (int result = 1; result <= N; result++) {
            System.out.print(baskets[result] + " ");
        }
    }
}