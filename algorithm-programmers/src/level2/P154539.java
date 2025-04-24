package src.level2;

/*
level-2
뒤에 있는 큰 수 찾기

입출력 예
numbers	            result
[2, 3, 3, 5]	    [3, 5, 5, -1]
[9, 1, 5, 3, 6, 2]	[-1, 5, 6, 6, -1, -1]
 */

import java.util.Arrays;
import java.util.Stack;

public class P154539 {
    public static void main(String[] args) {
        int[] numbers = {2,3,3,5};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
}
