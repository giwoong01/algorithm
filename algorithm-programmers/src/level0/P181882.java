package src.level0;

/*
level-0
조건에 맞게 수열 변환하기 1

입출력 예
arr	                    result
[1, 2, 3, 100, 99, 98]	[2, 2, 6, 50, 99, 49]
 */

import java.util.Arrays;

public class P181882 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}
