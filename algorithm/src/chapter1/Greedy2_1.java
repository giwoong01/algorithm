package src.chapter1;

// 큰 수의 법칙
// 단순하게 푸는 방법

// 입력
// 5 8 3
// 2 4 5 4 6

// 출력
// 46

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr);
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        int result = 0;

        while (true) {
            for (int i = 0; i < k; i++) {
                if (m == 0) {
                    break;
                }
                result += first;
                m -= 1;
            }
            if (m == 0) {
                break;
            }
            result += second;
            m -= 1;
        }

        System.out.println(result);
    }
}
