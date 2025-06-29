package src.level0;

/*
level-0
조건 문자열

입출력 예
ineq	eq	n	m	result
"<"	    "="	20	50	1
">"	    "!"	41	78	0
 */

public class P181934 {
    public static void main(String[] args) {
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;

        System.out.println(solution(ineq, eq, n, m));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">") && eq.equals("=")) {
            boolean b = n >= m;
            if (b) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals("<") && eq.equals("=")) {
            boolean b = n <= m;
            if (b) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            boolean b = n > m;
            if (b) {
                return 1;
            } else {
                return 0;
            }
        } else {
            boolean b = n < m;
            if (b) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
