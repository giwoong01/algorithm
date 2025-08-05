package src.level0;

/*
level-0
코드 처리하기

입출력 예
code	        result
"abc1abc1abc"	"acbac"
 */

public class P181932 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";

        System.out.println(solution(code));
    }

    public static String solution(String code) {
        int mode = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (String.valueOf(c).equals("1") && mode == 0) {
                mode = 1;
                continue;
            } else if (String.valueOf(c).equals("1") && mode == 1) {
                mode = 0;
                continue;
            }

            if (mode == 0) {
                if (i % 2 == 0) {
                    sb.append(c);
                }
            } else {
                if (i % 2 == 1) {
                    sb.append(c);
                }
            }

        }

        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}
