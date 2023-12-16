package src.level0;

/*
level-0
중앙값 구하기

입출력 예
array	            result
[1, 2, 7, 10, 11]	7
[9, -1, 0]	        0
 */

import java.util.Arrays;

public class P120811 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
