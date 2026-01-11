package silver2;

/*
가장 긴 증가하는 부분 수열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] seq = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < N; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = - 1;
        for (int i = 0; i < N; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
