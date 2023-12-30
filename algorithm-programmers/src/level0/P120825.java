package src.level0;

/*
level-0
문자 반복 출력하기

입출력 예
my_string	n	result
"hello"	    3	"hhheeellllllooo"
 */

public class P120825 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            answer.append(String.valueOf(c).repeat(Math.max(0, n)));
        }

        return String.valueOf(answer);
    }
}
