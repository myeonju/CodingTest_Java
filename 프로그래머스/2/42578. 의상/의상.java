import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] c : clothes) {
            String category = c[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        int answer = 1;
        
        for (int val : map.values()) {
            answer *= (val + 1);    
        }
        
        return answer - 1;
    }
}
