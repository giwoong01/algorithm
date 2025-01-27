package src.level0;

/*
level-0
합성수 찾기

입출력 예
n	result
10	5
15	8
 */

public class P120846 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j * j <= i; j++) {

                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }

            }

            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }
}
