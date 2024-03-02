import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        List<Integer> answerList = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : entryList) {
            String key = entry.getKey();
            
            List<Integer> genreIndexList = new ArrayList<>();
            
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(key)){
                    genreIndexList.add(i);
                }
            }
            
            Collections.sort(genreIndexList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if(plays[o1] == plays[o2]){
                        return o1.compareTo(o2);
                    } else {
                        return Integer.compare(plays[o2], plays[o1]);
                    }
                }
            });
            
            int count = 0;
            for(int index : genreIndexList){
                answerList.add(index);
                count++;
                if(count == 2){
                    break;
                }
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
