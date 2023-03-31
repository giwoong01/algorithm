package src.level2;

// level-2
// 짝지어 제거하기

// s	    result
// baabaa	1
// cdcd	    0

import java.util.Stack;

public class P12973 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
