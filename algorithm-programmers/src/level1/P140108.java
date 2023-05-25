package src.level1;

// level-1
// 문자열 나누기

// 입출력 예
// s	            result
// "banana"	        3
// "abracadabra"	6
// "aaabbaccccabba"	3
// 35, 36, 39, 41번 실패 -> 반례 "abaa"

import java.util.Stack;

public class P140108 {
    public static void main(String[] args) {
        String s = "abaa";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        int check = 0;
        int equalsCount = 0;
        int difCount = 0;
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(check);

            if (stack.isEmpty()) {
                stack.push(ch);
                equalsCount += 1;
            }

            if (ch == s.charAt(i)) {
                stack.push(s.charAt(i));
                equalsCount += 1;
            } else {
                stack.pop();
                difCount += 1;
            }

            if (equalsCount == difCount) {
                check = equalsCount + difCount;
                i = check;
                answer += 1;
            }
        }

        if (s.length() > equalsCount + difCount) {
            answer += 1;
        }

        if (equalsCount > difCount) {
            answer += 1;
        }

        return answer;
    }
}
