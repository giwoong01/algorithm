package src.level0;

/*
level-0
머쓱이보다 키 큰 사람

입출력 예
array	                height	result
[149, 180, 192, 170]	167	    3
[180, 120, 140]	        190 	0
 */

import java.util.Arrays;

public class P120585 {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;

        System.out.println(solution(array, height));
    }

    public static int solution(int[] array, int height) {
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                return array.length - i;
            }
        }

        return 0;
    }
}
