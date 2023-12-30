import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        scanner.close();

        int sum=0;

        for(int i=0; i<n; i++){
            sum+= Character.digit(str.charAt(i),10);
        }
        System.out.println(sum);

    }
}