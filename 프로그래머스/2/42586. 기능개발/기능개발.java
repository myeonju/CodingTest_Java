import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++){
            int days = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            queue.add(days);
        }
        
            
        int[] answer = new int[progresses.length]; 
        
        int idx = 0; 
        
        while(!queue.isEmpty()){
            int cnt = 1;
            int current = queue.poll(); 
            
            while(!queue.isEmpty() && current >= queue.peek()){
                queue.poll(); 
                cnt++; 
            }
            
            answer[idx++] = cnt; 
        }
        

        int[] result = new int[idx];
        for(int i=0; i<idx; i++){
            result[i] = answer[i];
        }
        
        return result;
    }
}
