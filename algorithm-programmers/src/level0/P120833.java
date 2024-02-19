package src.level0;

/*
level-0
배열 자르기

입출력 예
numbers	        num1	num2	result
[1, 2, 3, 4, 5]	1	    3	    [2, 3, 4]
[1, 3, 5]	    1	    2	    [3, 5]
 */

import java.util.Arrays;

public class P120833 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;

        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index++] = numbers[i];
        }

        return answer;
    }
}
