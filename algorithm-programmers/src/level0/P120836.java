package src.level0;

/*
level-0
순서쌍의 개수

입출력 예
n	result
20	6
100	9
 */

public class P120836 {
    public static void main(String[] args) {
        int n = 20;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
