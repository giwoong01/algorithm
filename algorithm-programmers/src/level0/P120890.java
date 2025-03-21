package src.level0;

/*
level-0
가까운 수

입출력 예
array	        n	result
[3, 10, 28]	    20	28
[10, 11, 12]	13	12
 */

import java.util.Arrays;

public class P120890 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }

        return array[0];
    }
}
