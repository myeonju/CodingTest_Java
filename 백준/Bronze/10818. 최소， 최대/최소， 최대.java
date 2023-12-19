import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] num = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println(min + " " + max );
    }
}