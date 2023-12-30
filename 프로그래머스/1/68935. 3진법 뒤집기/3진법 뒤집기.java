import java.util.*;
class Solution {
    public int solution(int n) {
        String st = Integer.toString(n,3);
        String reversed = new StringBuilder(st).reverse().toString();
        int answer = Integer.parseInt(reversed,3);
        System.out.println(answer);
        return answer;
    }
}