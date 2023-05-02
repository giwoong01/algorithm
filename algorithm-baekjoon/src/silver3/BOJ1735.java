package silver3;

// 분수 합
// 분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.
// 두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
// 기약분수란 더 이상 약분되지 않는 분수를 의미한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int resultA = (A1 * B2) + (A2 * B1);
        int resultB = B1 * B2;

        int gcd = getGCD(resultA, resultB);

        System.out.println(resultA / gcd + " " + resultB / gcd);
    }

    // 최대공약수
    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return getGCD(b, a % b);
        }
    }
}
