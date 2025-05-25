package src.level0;

/*
level-0
수열과 구간 쿼리 4

입출력 예
arr	            queries	                        result
[0, 1, 2, 4, 3]	[[0, 4, 1],[0, 3, 2],[0, 3, 3]]	[3, 2, 4, 6, 4]
 */

import java.util.Arrays;

public class P181922 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,1,}, {0,3,2}, {0,3,3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    arr[j] += 1;
                }
            }
        }

        return arr;
    }
}
