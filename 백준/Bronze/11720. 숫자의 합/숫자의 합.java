import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String number = scanner.next();

        int sum=0;
        for(int i=0; i<num; i++){
            sum+= Character.getNumericValue(number.charAt(i));
        }
        
        System.out.println(sum);

        scanner.close();
    }
}