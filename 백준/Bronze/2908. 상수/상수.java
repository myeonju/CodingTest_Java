import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        String snum1 = String.valueOf(num1);
        String snum2 = String.valueOf(num2);

        int reversedNum1 = Integer.valueOf(reverseString(snum1));
        int reversedNum2 = Integer.valueOf(reverseString(snum2));

        if(reversedNum1>reversedNum2){
            System.out.println(reversedNum1);
        }else{
            System.out.println(reversedNum2);
        }


    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}