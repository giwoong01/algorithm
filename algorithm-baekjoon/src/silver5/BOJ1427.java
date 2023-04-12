package silver5;

// 소트인사이드
// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        int[] result = new int[arr.length];
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
            System.out.print(result[i]);
        }

    }
}
