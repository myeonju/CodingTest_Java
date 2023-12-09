import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length<=1){
            return new int []{-1};
        }
        
        int min = Integer.MAX_VALUE;
        
        
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min){
                resultList.add(arr[i]);
            }
        }
        
        int[] answer = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            answer[i]=resultList.get(i);
        }
        
        return answer;
    }
}

//리스트는 크기를 동적으로 조절할 수 있는 자료구조. (중간에 삽입, 삭제 간편)