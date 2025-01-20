package src.level0;

/*
level-0
배열 회전시키기

입출력 예
numbers	                    direction	result
[1, 2, 3]	                "right"	    [3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	    [455, 6, 4, -1, 45, 6, 4]
 */

import java.util.Arrays;

public class P120844 {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        System.out.println(Arrays.toString(solution(numbers, direction)));
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];

            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
        } else {
            answer[numbers.length - 1] = numbers[0];

            System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
        }

        return answer;
    }
}
