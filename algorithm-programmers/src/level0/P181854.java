package src.level0;

/*
level-0
배열의 길이에 따라 다른 연산하기

입출력 예
arr	                    n	result
[49, 12, 100, 276, 33]	27	[76, 12, 127, 276, 60]
[444, 555, 666, 777]	100	[444, 655, 666, 877]
 */

import java.util.Arrays;

public class P181854 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        System.out.println(Arrays.toString(solution(arr, n)));
    }

    public static int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] += n;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
        }

        return arr;
    }
}
