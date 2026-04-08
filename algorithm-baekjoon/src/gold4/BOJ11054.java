package gold4;

/*
가장 긴 바이토닉 수열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");

        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(parts[i]);
        }

        int[] dpInc = new int[n];
        for (int i = 0; i < n; i++) {
            dpInc[i] = 1;

            for (int j = 0; j < i; j++) {
                if (seq[i] > seq[j]) {
                    dpInc[i] = Math.max(dpInc[i], dpInc[j] + 1);
                }
            }
        }

        int[] dpDec = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            dpDec[i] = 1;

            for (int j = n - 1; j > i; j--) {
                if (seq[i] > seq[j]) {
                    dpDec[i] = Math.max(dpDec[i], dpDec[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dpInc[i] + dpDec[i] - 1);
        }

        System.out.println(max);
    }
}
