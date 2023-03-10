package src.level2;

// level-2
// 올바른 괄호

// 입출력 예
// s	    answer
// "()()"	true
// "(())()"	true
// ")()("	false
// "(()("	false

public class P12909 {
    boolean solution(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }

        return openCount == closeCount;
    }
}
