package src.level0;

/*
level-0
약수 구하기

입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120897 {
    public static void main(String[] args) {
        int n = 24;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
