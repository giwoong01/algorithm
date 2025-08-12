package src.level0;

/*
level-0
최빈값 구하기

입출력 예
array	            result
[1, 2, 3, 3, 3, 4]	3
[1, 1, 2, 2]	    -1
[1]	                1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P120812 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int max = 0;
        for (Integer value : map.values()) {
            max = Math.max(max, value);
        }

        int mode = 0;
        for (Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == max) {
                mode++;

                if (mode == 1) {
                    answer = integerIntegerEntry.getKey();
                } else {
                    answer = -1;
                }

            }
        }

        return answer;
    }
}
