package src.level1;

// level-1
// 시저 암호
// 입출력 예
// s	    n	result
//"AB"	    1	"BC"
//"z"	    1	"a"
//"a B z"	4	"e F d"

public class 시저암호 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch + n > 'z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            }
            if (ch >= 'A' && ch <= 'Z') {
                if (ch + n > 'Z') {
                    answer.append((char) (ch - 26 + n));
                } else {
                    answer.append((char) (ch + n));
                }
            }
        }

        return answer.toString();
    }
}
