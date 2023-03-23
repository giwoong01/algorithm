package bronze1;

// 최대공약수와 최소공배수
// 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[2];

        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                arr[0] = i;
                arr[1] = (n * m) / arr[0];
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
