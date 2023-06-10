package silver3;

// 수열
// 매일 아침 9시에 학교에서 측정한 온도가 어떤 정수의 수열로 주어졌을 때, 연속적인 며칠 동안의 온도의 합이 가장 큰 값을 알아보고자 한다.
// 예를 들어, 아래와 같이 10일 간의 온도가 주어졌을 때,
// 3 -2 -4 -9 0 3 7 13 8 -3
// 모든 연속적인 이틀간의 온도의 합 중 최댓값은 21이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new  int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int maxSum = -300;
        for (int i = K; i <= N; i++) {
            int sum = arr[i] - arr[i - K];

            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
