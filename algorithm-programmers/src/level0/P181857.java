package src.level0;

/*
level-0
배열의 길이를 2의 거듭제곱으로 만들기

입출력 예
arr	                result
[1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
[58, 172, 746, 89]	[58, 172, 746, 89]
 */

import java.util.Arrays;

public class P181857 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int n = 1;

        while (arr.length > n) {
            n *= 2;
        }

        int[] newArr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
