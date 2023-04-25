package src.level2;

// level-2
// 예상 대진표

// 입출력 예
// N	A	B	answer
// 8	4	7	3

public class P12985 {
    public int solution(int n, int a, int b) {
        int answer = 1;

        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;

            if (a == b)
                break;

            answer++;
        }

        return answer;
    }
}
