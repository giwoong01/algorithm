package bronze5;

/*
A + B - 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] split = br.readLine().split(" ");

            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }

    }
}
