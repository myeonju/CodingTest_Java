import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int length = str.length();
        
        int[] answer = new int[length];
      
        for(int i=0; i<length; i++){
            answer[i]=str.charAt(length-1-i)-'0'; 
            //ASCII '0' = 48. 문자의 아스키코드를 정수로 변환하기 위함
        }
        return answer;
    }
}