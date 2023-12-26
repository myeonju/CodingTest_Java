class Solution {
    public int solution(String t, String p) {
        int answer = 0;
     
        for(int i=0; i<=t.length()- p.length(); i++){
            String num = t.substring(i,i+p.length());
            if(Long.parseLong(num) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}