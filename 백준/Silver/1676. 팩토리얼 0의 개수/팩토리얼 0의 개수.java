import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        while (N>=5){
            count += N/5;
            N/=5;
        }
        System.out.println(count);
    }
}