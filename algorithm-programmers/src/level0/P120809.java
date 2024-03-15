package src.level0;

/*
level-0
배열 두 배 만들기

입출력 예
numbers	                    result
[1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
 */

import java.util.Arrays;

public class P120809 {
    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(answer)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

}
