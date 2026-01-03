package src.level0;

/*
level-0
정수를 나선형으로 배치하기

입출력 예
n	result
4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
 */

import java.util.Arrays;

public class P181832 {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int xStart = 0;
        int xEnd = n - 1;
        int yStart = 0;
        int yEnd = n - 1;

        while(num <= n * n) {
            for (int i = xStart; i <= xEnd; i++) {
                answer[yStart][i] = num++;
            }
            yStart++;

            for (int i = yStart; i <= yEnd; i++) {
                answer[i][xEnd] = num++;
            }
            xEnd--;

            for (int i = xEnd; i >= xStart; i--) {
                answer[yEnd][i] = num++;
            }
            yEnd--;

            for (int i = yEnd; i >= yStart; i--) {
                answer[i][xStart] = num++;
            }
            xStart++;
        }

        return answer;
    }
}
