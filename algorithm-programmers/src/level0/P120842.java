package src.level0;

/*
level-0
2차원으로 만들기

입출력 예
num_list	                        n	result
[1, 2, 3, 4, 5, 6, 7, 8]	        2	[[1, 2], [3, 4], [5, 6], [7, 8]]
[100, 95, 2, 4, 5, 6, 18, 33, 948]	3	[[100, 95, 2], [4, 5, 6], [18, 33, 948]]
 */

import java.util.Arrays;

public class P120842 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        System.out.println(Arrays.deepToString(solution(num_list, n)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        int index = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }
}
