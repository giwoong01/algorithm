package gold4;

/*
검문
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int gcd = arr[1] - arr[0];

        for (int i = 2; i < N; i++) {
            gcd = gcd(gcd, arr[i] - arr[i - 1]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= gcd; i++) {
            if (gcd % i == 0) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
