package gold5;

/*
암호코드
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] dp = new int[str.length() + 1];
        dp[0] = dp[1] = 1;

        if (str.charAt(0) == '0') {
            dp[str.length()] = 0;
        } else {
            for (int i = 2; i <= str.length(); i++) {
                int preC = Character.getNumericValue(str.charAt(i - 2));
                int curC = Character.getNumericValue(str.charAt(i - 1));

                if (curC == 0) {
                    if (preC == 1 || preC == 2) {
                        dp[i] = dp[i - 2];
                    }
                } else {
                    if (preC == 1 || (preC == 2 && curC <= 6)) {
                        dp[i] = (dp[i - 1] + dp[i - 2]) % 1_000_000;
                    } else {
                        dp[i] = dp[i - 1];
                    }
                }
            }
        }

        System.out.println(dp[str.length()]);
    }
}
