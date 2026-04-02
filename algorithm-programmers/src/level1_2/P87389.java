package src.level1_2;

/*
입출력 예
n	result
10	3
12	11
 */

public class P87389 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return answer;
    }
}
