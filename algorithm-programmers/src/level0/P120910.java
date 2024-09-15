package src.level0;

/*
level-0
세균 증식

입출력 예
n	t	result
2	10	2048
7	15	229,376
 */

public class P120910 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;

        System.out.println(solution(n, t));
    }

    public static int solution(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer = answer * 2;
        }

        return answer;
    }

}
