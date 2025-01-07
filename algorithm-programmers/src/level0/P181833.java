package src.level0;

/*
level-0
특별한 이차원 배열 1

입출력 예
n	result
3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
1	[[1]]
 */

import java.util.Arrays;

public class P181833 {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
