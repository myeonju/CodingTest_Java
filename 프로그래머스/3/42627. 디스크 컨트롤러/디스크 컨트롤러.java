import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); 
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); 
        
        int cnt = 0; 
        int idx = 0; 
        int time = 0; 
        int totalTime = 0;
        
        while(cnt < jobs.length) {
  
            while(idx < jobs.length && jobs[idx][0] <= time) {
                pq.offer(jobs[idx++]);
            }
            
            if(pq.isEmpty()) {
           
                time = jobs[idx][0];
            } else {
             
                int[] job = pq.poll();
                time += job[1]; 
                totalTime += time - job[0]; 
                cnt++; 
            }
        }
        
        return totalTime / jobs.length;
    }
}
