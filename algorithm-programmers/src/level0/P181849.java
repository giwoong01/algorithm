package src.level0;

/*
level-0
문자열 정수의 합

입출력 예
num_str	    result
"123456789"	45
"1000000"	1
 */

public class P181849 {
    public static void main(String[] args) {
        String num_str = "123456789";

        System.out.println(solution(num_str));
    }

    public static int solution(String num_str) {
        int answer = 0;

        for (char c : num_str.toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
