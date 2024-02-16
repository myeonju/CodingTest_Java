import java.util.*;

public class Main{

    static int cnt;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            cnt = 0;
            String s = scanner.next();
            sb.append(isPalindrome(s)).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
    private static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    private static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}