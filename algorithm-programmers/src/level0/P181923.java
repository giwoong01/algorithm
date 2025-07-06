package src.level0;

/*
level-0
수열과 구간 쿼리 2

입출력 예
arr	            queries	                        result
[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
 */

import java.util.Arrays;

public class P181923 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0 ; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = 1_000_000;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    min = Math.min(arr[j], min);
                }
            }

            if (min == 1_000_000) {
                min = -1;
            }

            answer[i] = min;
        }

        return answer;
    }
}
