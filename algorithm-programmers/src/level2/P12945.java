package src.level2;

// level-2
// 피보나치 수

// 입출력 예
// n	return
// 3	2
// 5	5

public class P12945 {
    public int solution(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
