package src.level0;

/*
level-0
정사각형으로 만들기

입출력 예
arr	                                                                result
[[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]	[[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
[[57, 192, 534, 2], [9, 345, 192, 999]]	                            [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
[[1, 2], [3, 4]]	                                                [[1, 2], [3, 4]]
 */

import java.util.Arrays;

public class P181830 {
    public static void main(String[] args) {
        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        System.out.println(Arrays.deepToString(solution(arr)));
    }

    public static int[][] solution(int[][] arr) {
        int[][] answer = new int[Math.max(arr.length, arr[0].length)][Math.max(arr.length, arr[0].length)];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
