package src.level0;

/*
level-0
조건에 맞게 수열 변환하기 2

입출력 예
arr                 	result
[1, 2, 3, 100, 99, 98]	5
 */

import java.util.Arrays;

public class P181881 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];

        for (int j = 0; j < arr.length; j++) {
            arr2 = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, arr2)) {
                answer = j;
                break;
            }
        }

        return answer;
    }
}
