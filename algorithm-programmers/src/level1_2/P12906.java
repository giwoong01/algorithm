package src.level1_2;

/*
입출력 예
arr	            answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]	    [4,3]

 */

import java.util.Arrays;
import java.util.Stack;

public class P12906 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (!stack.isEmpty() && stack.peek() == i) {
                continue;
            }

            stack.push(i);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
