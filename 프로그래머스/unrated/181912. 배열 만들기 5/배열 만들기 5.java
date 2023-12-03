import java.util.*; 
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for(String str : intStrs){ // inStrs 배열에 있는 각 문자열에 대해 반복문 실행.'str'변수는 현재 반복에서 처리 중인 문자열 의미
            String subStr = str.substring(s, s+l);
            int num = Integer.parseInt(subStr); //정수로 반환
            if(num > k){
                result.add(num);
            }
        }
        return result;
    }
}