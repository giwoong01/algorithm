package src.level0;

/*
level-0
가장 큰 수 찾기

입출력 예
array	        result
[1, 8, 3]	    [8, 1]
[9, 10, 11, 8]	[11, 2]
 */

import java.util.Arrays;

public class P120899 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};

        System.out.println(Arrays.toString(solution(array)));
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}
