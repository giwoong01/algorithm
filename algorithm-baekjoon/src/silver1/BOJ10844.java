package silver1;

// 쉬운 계단 수
// 45656이란 수를 보자. 이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.
// N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
// 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

import java.util.Scanner;

public class BOJ10844 {
    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dp = new Long[N + 1][10];

        // 첫번째 자릿수는 1로 초기화
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += recur(N, i);
        }
        System.out.println(result % MOD);
    }

    /*
        digit 는 자릿수, val 은 자릿값
     */
    static long recur(int digit, int val) {
        // 첫째자릿수에 도착하면 리턴
        if (digit == 1) {
            return dp[digit][val];
        }
        // 해당 자릿수의 val값애 대해 탐색하지 않은경우
        if (dp[digit][val] == null) {
            // val 이 0인경우 다음 수는 1밖에 못옴
            if (val == 0) {
                dp[digit][val] = recur(digit - 1, 1);
            }
            // val 이 9인경우 다음수는 8밖에 못옴
            else if (val == 9) {
                dp[digit][val] = recur(digit - 1, 8);
            }
            // 그 외 val - 1 or val + 1
            else {
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }

        return dp[digit][val] % MOD;
    }
}
