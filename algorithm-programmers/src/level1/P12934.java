package src.level1;

// lever-1
// 정수 제곱근 판별

public class P12934 {
    public long solution(long n) {
        long answer = 0;

        answer = (long) Math.sqrt(n); // 제곱근

        if (n == (long) Math.pow(answer, 2)) {  // 제곱
            answer = (long) Math.pow(answer + 1, 2); // 제곱
        } else {
            answer = -1;
        }

        return answer;
    }
}
