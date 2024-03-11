import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count = 0;
        int countK = 0;
        
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
            
            if (scoville[i] >= K) {
                countK++;
            }
        }
        
        while (!pq.isEmpty() && pq.peek() < K) {
            int num1 = pq.poll();
            
            if (pq.isEmpty()) {
                break; 
            }
            
            int num2 = pq.peek();
            int num3 = num1 + (num2 * 2);
            
            pq.poll();
            pq.add(num3);
            countK++;
            count++;
        }

        if (pq.isEmpty() || pq.peek() < K) {
            return -1;
        }
        
        return count;
    }
}
