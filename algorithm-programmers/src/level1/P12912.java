package src.level1;

// level-1
// 두 정수 사이의 합

public class P12912 {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
}
