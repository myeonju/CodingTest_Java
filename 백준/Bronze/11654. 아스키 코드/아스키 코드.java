import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println(asciiValue);
        
        scanner.close();
    }
}