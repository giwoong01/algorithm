package src.level0;

/*
level-0
소인수분해

입출력 예
n	result
12	[2, 3]
17	[17]
420	[2, 3, 5, 7]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120852 {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }

                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
