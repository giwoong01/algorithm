package src.level0;

/*
level-0
자릿수 더하기

입출력 예
n	    result
1234	10
930211	16
 */

public class P120906 {
    public static void main(String[] args) {
        int n = 1234;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (char c : String.valueOf(n).toCharArray()) {
            answer += c - '0';
        }

        return answer;
    }
}
