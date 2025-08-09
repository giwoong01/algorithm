package src.level0;

/*
level-0
다항식 더하기

입출력 예
polynomial	    result
"3x + 7 + x"	"4x + 7"
"x + x + x"	    "3x"
 */

public class P120863 {
    public static void main(String[] args) {
        String polynomial = "x + 5";

        System.out.println(solution(polynomial));
    }

    public static String solution(String polynomial) {
        String[] split = polynomial.split("\\+");
        int x = 0;
        int b = 0;
        for (String s : split) {
            s = s.trim();

            if (s.contains("x")) {
                if (s.equals("x")) {
                    x += 1;
                    continue;
                }

                String[] split1 = s.split("x");
                x += Integer.parseInt(split1[0]);
            } else {
                b += Integer.parseInt(s);
            }
        }

        String answer;
        if (x == 0) {
            answer = String.valueOf(b);
        } else if (x == 1 && b != 0) {
            answer = "x" + " + " + b;
        } else if (x == 1) {
            answer = "x";
        } else if (b == 0) {
            answer = x + "x";
        }  else {
            answer = x + "x" + " + " + b;
        }

        return answer;
    }
}
