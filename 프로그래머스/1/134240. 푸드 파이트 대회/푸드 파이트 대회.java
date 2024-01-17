class Solution {
    public String solution(int[] food) {
        StringBuilder builder = new StringBuilder();
        int[] cnt = new int[food.length]; 
        for(int i=1; i<food.length; i++){
            if(food[i]%2==1){
                food[i]--;
            }
            cnt[i] = food[i]/2;
        }
        
        for(int i=1; i<cnt.length; i++){
            for(int j=0; j<cnt[i]; j++){
                builder.append(String.valueOf(i)); 
            }
        }
        
        String reversed = new StringBuilder(builder).reverse().toString();
        
        return builder + "0" + reversed;
       
    }
}