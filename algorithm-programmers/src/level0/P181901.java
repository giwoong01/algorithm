package src.level0;

/*
level-0
배열 만들기1

입출력 예
n	k	result
10	3	[3, 6, 9]
15	5	[5, 10, 15]
 */

import java.util.Arrays;

public class P181901 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }

        return answer;
    }
}
