import java.util.*;

class Solution {
    public String solution(int[] numbers) {
    
        String[] strNumbers = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            strNumbers[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strNumbers, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(String str: strNumbers){
            sb.append(str);
        }
        
        if(sb.charAt(0) == '0'){
            return "0";
        }
        
        return sb.toString();
    }
}