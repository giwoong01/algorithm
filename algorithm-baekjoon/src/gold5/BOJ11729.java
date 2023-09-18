package gold5;

/*
하노이 탑 이동 순서
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11729 {
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append("\n");
        hanoiTop(N, 1, 2, 3);

        System.out.println(sb);
    }

    public static void hanoiTop(int N, int a, int b, int c) {
        if (N == 1) {
            sb.append(a).append(" ").append(c).append("\n");
        } else {
            hanoiTop(N - 1, a, c, b);
            sb.append(a).append(" ").append(c).append("\n");
            hanoiTop(N - 1, b, a, c);
        }
    }
}
