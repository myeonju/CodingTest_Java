import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int num=0; num<arr.length; num++) {
            if (stack.isEmpty() || stack.peek() != arr[num]) {
                stack.push(arr[num]);
                queue.offer(arr[num]);
            }
        }

        int[] answer = new int[queue.size()];
        int index = 0;

        while (!queue.isEmpty()) {
            answer[index++] = queue.poll();
        }

        return answer;
    }
}
