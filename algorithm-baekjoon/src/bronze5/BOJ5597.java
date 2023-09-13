package bronze5;

/*
과제 안 내신 분..?

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int idx = Integer.parseInt(br.readLine());
            arr[idx - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i + 1);
            }
        }

    }
}
