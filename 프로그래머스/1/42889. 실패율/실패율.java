import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] currentStages = new int[N + 1];
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            currentStages[stages[i] - 1] += 1;
        }

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Double.compare(map.get(o2), map.get(o1));
            }
        });

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}