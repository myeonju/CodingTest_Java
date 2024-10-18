import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty() || stack.peek() != arr[i]){
                stack.push(arr[i]);
                queue.offer(arr[i]);
            }
        }
        
        int[] answer = new int[queue.size()];
        int index=0;
        
        while(!queue.isEmpty()){
            answer[index++] = queue.poll();
        }

        return answer;
    }
}