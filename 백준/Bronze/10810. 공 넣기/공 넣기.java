import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] basket = new int[N];

        for (int cnt = 0; cnt < M; cnt++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int num = i-1; num <= j-1; num++) {
                basket[num] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<basket.length; i++){
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
        
    }

}
