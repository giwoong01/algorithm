package src.level0;

/*
level-0
피자 나눠 먹기 (2)

입출력 예
n	result
6	1
10	5
4	2
 */

public class P120815 {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
