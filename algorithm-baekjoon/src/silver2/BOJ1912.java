package silver2;

/*
연속합
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] seq = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(parts[i]);
        }

        dp[0] = seq[0];
        int max = seq[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + seq[i], seq[i]);

            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
