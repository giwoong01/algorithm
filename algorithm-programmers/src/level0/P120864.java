package src.level0;

/*
level-0
숨어있는 숫자의 덧셈 (2)

입출력 예
my_string	    result
"aAb1B2cC34oOp"	37
"1a2b3c4d123Z"	133
 */

public class P120864 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        int answer = 0;

        String[] split = my_string.split("[a-zA-Z]");

        for (String s : split) {
            if (s.isEmpty()) {
                continue;
            }

            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
