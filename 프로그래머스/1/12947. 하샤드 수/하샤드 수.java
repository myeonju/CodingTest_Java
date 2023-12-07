class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int number=0;
        String strX = Integer.toString(x);
        
        for(int i=0; i<strX.length(); i++){
            number += Character.getNumericValue(strX.charAt(i));
        }
        
        if(x%number!=0){
            answer=false;
        }
        
        return answer;
    }
}