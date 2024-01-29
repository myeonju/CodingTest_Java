import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String number = Integer.toString(N);
        Character[] num = new Character[number.length()];

        for(int i=0; i<num.length; i++){
            num[i] = number.charAt(i);
        }

        Arrays.sort(num, Collections.reverseOrder());

        StringBuilder builder = new StringBuilder();
        for(Character n: num){
            builder.append(n);
        }
        
        int result = Integer.parseInt(builder.toString());
        System.out.println(result);
    }
}
