package src.level0;

/*
level-0
숨어있는 숫자의 덧셈 (1)

입출력 예
my_string	    result
"aAb1B2cC34oOp"	10
"1a2b3c4d123"	16
 */

public class P120851 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }

        return answer;
    }
}
