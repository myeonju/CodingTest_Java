import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int t = 0; t < T; t++) {
            int R = scanner.nextInt(); 
            String S = scanner.next(); 

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println(); 
        }

        scanner.close();
    }
}