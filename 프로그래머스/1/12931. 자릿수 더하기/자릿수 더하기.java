//자릿수를 문자열로 변환후, 각 문자를 숫자로 변환하여 더함
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String number = String.valueOf(n);
        
        for(int i=0; i<number.length(); i++){
            answer += Character.getNumericValue(number.charAt(i));
        }
     
        return answer;
    }
}