package src.level0;

/*
level-0
조건에 맞게 수열 변환하기 3

입출력 예
arr	                    k	result
[1, 2, 3, 100, 99, 98]	3	[3, 6, 9, 300, 297, 294]
[1, 2, 3, 100, 99, 98]	2	[3, 4, 5, 102, 101, 100]
 */

import java.util.Arrays;

public class P181835 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }

        return answer;
    }
}
