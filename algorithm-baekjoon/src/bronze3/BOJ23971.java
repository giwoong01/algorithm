package bronze3;

/*
ZOAC 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");

        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);
        int N = Integer.parseInt(parts[2]);
        int M = Integer.parseInt(parts[3]);

        int result = ((H - 1) / (N + 1) + 1) * ((W - 1) / (M + 1) + 1);

        System.out.println(result);
    }
}
