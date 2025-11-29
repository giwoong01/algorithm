package bronze3;

/*
A+B - 6
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(",");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            System.out.println(A + B);
        }

    }
}
