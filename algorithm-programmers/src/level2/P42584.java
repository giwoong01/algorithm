package src.level2;

/*
level-2
주식가격

입출력 예
prices	        return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
 */

import java.util.Arrays;
import java.util.Stack;

public class P42584 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(stackSolution(prices)));
    }

    public static int[] stackSolution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
        }

        return answer;
    }
}
