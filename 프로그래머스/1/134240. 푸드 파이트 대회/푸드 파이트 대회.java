class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        int[] cnt = new int[food.length]; 
        for(int i=1; i<food.length; i++){
            if(food[i]%2==1){
                food[i]--;
            }
            cnt[i] = food[i]/2;
        }
        
        for(int i=1; i<cnt.length; i++){
            for(int j=0; j<cnt[i]; j++){
                left.append(String.valueOf(i)); 
            }
        }
        
        String right = new StringBuilder(left).reverse().toString();
        
        return left + "0" + right;
       
    }
}