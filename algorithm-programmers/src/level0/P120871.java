package src.level0;

/*
level-0
저주의 숫자 3

입출력 예
n	result
15	25
40	76
 */

public class P120871 {
    public static void main(String[] args) {
        int n = 40;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;

            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
