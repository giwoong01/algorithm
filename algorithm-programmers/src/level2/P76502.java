package src.level2;

// level-2
// 괄호 회전하기

// 입출력 예
// s	    result
// "[](){}"	3
// "}]()[{"	2
// "[)(]"	0
// "}}}"	0

import java.util.*;

public class P76502 {
    public static void main(String[] args) {
        String s = "[](){}";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();

            String str = s.substring(i) + s.substring(0, i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
