package src.level2;

// level-2
// 귤 고르기

// 입출력 예
// k	tangerine	                result
// 6	[1, 3, 2, 5, 4, 5, 2, 3]	3
// 4	[1, 3, 2, 5, 4, 5, 2, 3]	2
// 2	[1, 1, 1, 1, 2, 2, 2, 3]	1

import java.util.*;

public class P138476 {
    public static void main(String[] args) {
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};

        System.out.println(solution(k, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : tangerine) {
            hm.merge(i, 1, Integer::sum);
        }

        List<Integer> valueList = new ArrayList<>(hm.keySet());
        valueList.sort((o1, o2) -> hm.get(o2).compareTo(hm.get(o1)));

        for (int i : valueList) {
            k -= hm.get(i);
            answer++;

            if (k <= 0) break;
        }

        return answer;
    }
}
