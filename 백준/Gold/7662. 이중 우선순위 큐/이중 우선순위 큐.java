import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> min = new PriorityQueue<>();
            PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
            map = new HashMap<>();

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String input = st.nextToken();

                if (input.equals("I")) {
                    int num = Integer.parseInt(st.nextToken());
                    max.add(num);
                    min.add(num);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else {
                    int type = Integer.parseInt(st.nextToken());

                    if (map.size() == 0) continue;

                    if (type == 1) {
                        delete(max);
                    } else {
                        delete(min);
                    }
                }
            }

            if (map.size() == 0) {
                sb.append("EMPTY\n");
            } else {
                int res = delete(max);

                sb.append(res + " ");

                if (map.size() > 0) res = delete(min);

                sb.append(res + "\n");
            }
        }

        System.out.println(sb);
    }

    static int delete(PriorityQueue<Integer> pq) {
        int res;

        while (true) {
            res = pq.poll();

            int cnt = map.getOrDefault(res, 0);

            if (cnt == 0) {
                continue;
            }

            if (cnt == 1) {
                map.remove(res);
            } else {
                map.put(res, cnt - 1);
            }

            break;
        }

        return res;
    }
}