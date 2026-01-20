package src.level1_2;

/*
입출력 예
n	return
12	28
5	6
 */

public class P12928 {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = n;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
