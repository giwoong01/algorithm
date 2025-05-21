package silver1;

/*
기타 레슨
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        int sum = 0;
        int max = 0;
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input2[i]);
            sum += arr[i];

            max = Math.max(max, arr[i]);
        }

        System.out.println(parametricSearch(max, sum, M, arr));
    }

    private static int compare(int middle, int[] arr) {
        int count = 1;
        int sum = 0;

        for (int i : arr) {
            if (sum + i > middle) {
                count++;
                sum = i;
            } else {
                sum += i;
            }
        }

        return count;
    }

    private static int parametricSearch(int left, int right, int M, int[] arr) {
        while (left <= right) {
            int middle = (left + right) / 2;
            int r = compare(middle, arr);

            if (r <= M) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }
}
