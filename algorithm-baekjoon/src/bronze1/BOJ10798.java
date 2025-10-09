package bronze1;

/*
세로읽기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] chars = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            max = Math.max(input.length(), max);

            for (int j = 0; j < input.length(); j++) {
                chars[i][j] = input.charAt(j);
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (chars[j][i] == '\0') continue;;
                sb.append(chars[j][i]);
            }
        }

        System.out.println(sb);
    }
}
