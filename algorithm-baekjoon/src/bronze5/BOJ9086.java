package bronze5;

/*
문자열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            System.out.println(String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length() - 1)));
        }
    }
}
