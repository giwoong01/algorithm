package bronze1;

/*
약수들의 합

-입력
입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000), 입력의 마지막엔 -1이 주어진다.

-출력
테스트케이스 마다 한줄에 하나씩 출력해야 한다. n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
이때, 약수들은 오름차순으로 나열해야 한다. n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int n;
        int sum;

        while (true) {
            n = Integer.parseInt(br.readLine());
            sb = new StringBuilder(n + " = 1");
            sum = 1;

            if (n == -1) break;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (sum == n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

    }
}
