package src.level0;

/*
level-0
qr code

입출력 예
q	r	code	            result
3	1	"qjnwezgrpirldywt"	"jerry"
1	0	"programmers"	    "programmers"
 */

public class P181903 {
    public static void main(String[] args) {
        int q = 3;
        int r = 1;
        String code = "repeat";

        System.out.println(solution(q, r, code));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }
}
