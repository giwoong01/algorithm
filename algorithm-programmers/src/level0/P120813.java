package src.level0;

/*
level-0
짝수는 싫어요

입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
 */

import java.util.Arrays;

public class P120813 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        int[] answer;

        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }

        return answer;
    }
}
