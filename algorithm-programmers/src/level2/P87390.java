package src.level2;

/*
level-2
n^2 배열 자르기

입출력 예
n	left	right	result
3	2	    5	    [3,2,2,3]
4	7	    14	    [4,3,3,3,4,4,4,4]
 */

import java.util.Arrays;

public class P87390 {
    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;

        System.out.println(Arrays.toString(solution(n, left, right)));
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        for (int i = 0; i < answer.length; i++) {
            int row = (int) ((i + left) / n) + 1;
            int col = (int) ((i + left) % n) + 1;
            answer[i] = Math.max(row, col);
        }

        return answer;
    }
}
