package gold5;

/*
합분해
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");

        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (j == 1) {
                    dp[i][j] = 1;
                } else if (i == 1) {
                    dp[i][j] = j;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1_000_000_000;
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
