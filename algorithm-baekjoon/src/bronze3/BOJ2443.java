package bronze3;

// 별 찍기 - 6
// 첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 문제
// 별은 가운데를 기준으로 대칭이어야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = (2 * N) - (i * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
