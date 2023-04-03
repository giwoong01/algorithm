package src.level1;

// level-1
// 소수 찾기

// n	result
// 10	4
// 5	3

public class P12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (!prime[i]) {
                answer++;
            }
        }

        return answer;
    }
}
