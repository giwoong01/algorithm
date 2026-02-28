package silver2;

/*
가장 큰 증가하는 부분 수열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] seq = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < parts.length; i++) {
            seq[i] = Integer.parseInt(parts[i]);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            dp[i] = seq[i];

            for (int j = 0; j < i; j++) {
                if (seq[j] < seq[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + seq[i]);
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
