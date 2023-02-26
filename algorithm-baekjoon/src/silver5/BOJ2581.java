package silver5;

// 소수
// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
// 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sumPrime = 0;
        int minPrime = N;

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i == 1) continue;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // 소수의 합과 최솟값
            if (isPrime) {
                sumPrime += i;
                if (minPrime > i) {
                    minPrime = i;
                }
            }
        }
        if (sumPrime == 0) { // 소수가 없을 경우
            System.out.println(-1);
            return;
        } else {
            System.out.println(sumPrime + "\n" + minPrime);
        }
    }
}
