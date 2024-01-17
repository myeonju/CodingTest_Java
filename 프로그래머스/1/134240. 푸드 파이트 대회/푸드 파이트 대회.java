class Solution {
    public String solution(int[] food) {
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            builder.append(Integer.toString(i).repeat(food[i] / 2));
        }
        
        return builder.toString() + "0" + builder.reverse().toString();
    }

}
