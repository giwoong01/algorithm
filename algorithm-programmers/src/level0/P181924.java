package src.level0;

/*
level-0
수열과 구간 쿼리 3

입출력 예
arr	            queries	                result
[0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
 */

import java.util.Arrays;

public class P181924 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int a = arr[queries[i][0]];
            int b = arr[queries[i][1]];

            arr[queries[i][0]] = b;
            arr[queries[i][1]] = a;
        }

        return arr;
    }
}
