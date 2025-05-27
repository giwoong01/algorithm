package src.level0;

/*
level-0
컨트롤 제트

입출력 예
s	            result
"1 2 Z 3"	    4
"10 20 30 40"	100
"10 Z 20 Z 1"	1
"10 Z 20 Z"	    0
"-1 -2 -3 Z"	-3
 */

public class P120853 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i - 1]);
            } else {
                answer += Integer.parseInt(split[i]);
            }
        }

        return answer;
    }
}
