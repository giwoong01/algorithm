package src.level2;

/*
level-2
롤케이크 자르기

입출력 예
topping	                    result
[1, 2, 1, 3, 1, 4, 1, 2]	2
[1, 2, 3, 1, 4]	            0
 */

import java.util.HashMap;
import java.util.Map;

public class P132265 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(solution(topping));
    }

    public static int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int k : topping) {
            map1.put(k, map1.getOrDefault(k, 0) + 1);
        }

        for (int t : topping) {
            map2.put(t, map2.getOrDefault(t, 0) + 1);

            if (map1.containsKey(t)) {
                if (map1.get(t) == 1) {
                    map1.remove(t);
                } else {
                    map1.put(t, map1.getOrDefault(t, 0) - 1);
                }
            }

            if (map1.keySet().size() == map2.keySet().size()) {
                answer++;
            }
        }

        return answer;
    }
}
