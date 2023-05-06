package src.level2;

// level-2
// 점프와 순간 이동

// 입출력 예
// N	result
// 5	2
// 6	2
// 5000	5

public class P12980 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                answer++;
                n -= 1;
            }
        }

        return answer;
    }
}
