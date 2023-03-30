package silver2;

// 베르트랑 공준
// 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
// 자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4948 {

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrime();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int primeCount = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if(!prime[i]) primeCount++;
            }

            System.out.println(primeCount);
        }

    }

    public static void getPrime() {
        // true = 소수 아님, false = 소수
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}
