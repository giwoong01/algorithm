package src.level0;

/*
level-0
최댓값 만들기(1)

입출력 예
numbers	                result
[1, 2, 3, 4, 5]	        20
[0, 31, 24, 10, 1, 9]	744
 */

import java.util.Arrays;

public class P120847 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
