package bronze4;

/*
숫자의 합
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            String[] parts = str.split("");

            sum += Integer.parseInt(parts[i]);
        }

        System.out.println(sum);
    }
}
