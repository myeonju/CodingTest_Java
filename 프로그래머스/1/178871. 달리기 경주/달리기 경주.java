import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranking = new HashMap<>();
        
        for (int i=0; i<players.length ; i++) {
            ranking.put(players[i], i);
        }
        

        for (String calling  : callings) {
            int rank  = ranking.get(calling);
            String frontPlayer = players[rank -1];
            
            ranking.replace(frontPlayer, rank);
            players[rank ] = frontPlayer;
            
            ranking.replace(calling, rank -1);
            players[rank -1] = calling; 
        }
        
        return players;
    }
}