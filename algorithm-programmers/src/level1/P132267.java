package src.level1;

// level-1
// 콜라 문제

// 입출력 예
// a	b	n	result
// 2	1	20	19
// 3	1	20	9

public class P132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (a <= n) {
            answer += (n / a) * b;
            n = (n / a * b) + (n % a);
        }

        return answer;
    }
}