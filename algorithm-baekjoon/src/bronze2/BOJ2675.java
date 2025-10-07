package bronze2;

/*
문자열 반복
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            String[] split = s.split(" ");

            int length = Integer.parseInt(split[0]);
            String str = split[1];
            char[] charArray = str.toCharArray();

            for (char c : charArray) {
                sb.append(String.valueOf(c).repeat(Math.max(0, length)));
            }

            System.out.println(sb);
        }
    }
}
