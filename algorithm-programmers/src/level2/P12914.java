package src.level2;

// level-2
// 멀리 뛰기

// 입출력 예
// n	result
// 4	5
// 3	3

public class P12914 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    /*
     n = 1, result = 1
     n = 2, result = 1
     n = 3, result = 3
     n = 4, result = 5
     n = 5, result = 8
     n = 6, result = 13
     ... 피보나치
     */
    public static long solution(int n) {
        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
