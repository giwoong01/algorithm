package silver2;

/*
가장 긴 감소하는 부분 수열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] seq = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < n; i++) {
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[j] > seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
