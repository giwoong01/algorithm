package src.level0;

/*
level-0
홀짝에 따라 다른 값 변환하기

입출력 예
n	result
7	16
10	220
 */

public class P181935 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += (int) Math.pow(i, 2);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer += i;
                }
            }
        }

        return answer;
    }
}
