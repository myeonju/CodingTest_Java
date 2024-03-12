import java.util.*;

class Solution {
    public int[] solution(String[] operations) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String operation : operations){
            String[] split = operation.split(" ");
            String cmd = split[0];
            int num = Integer.parseInt(split[1]);
            
            if(cmd.equals("I")){
                minHeap.offer(num);
                maxHeap.offer(num);
            } else if(cmd.equals("D")){
                if(minHeap.isEmpty()){
                    continue;
                }
                
                if(num == 1){
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                } else if(num == -1){
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }
        
        if(minHeap.isEmpty()){
            return new int[] {0,0};
        } else {
            return new int[] {maxHeap.poll(), minHeap.poll()};
        }
    }
}