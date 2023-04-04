package src.level2;

// level-2
// 숫자의 표현

// 입출력 예
// n	result
// 15	4

public class P12924 {
    public int solution(int n) {
        int answer = 1;

        for (int i = 0; i < n / 2; i++) {
            int sum = 0;
            for (int j = i + 1; sum < n; j++) {
                sum += j;
            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
