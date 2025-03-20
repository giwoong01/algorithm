package src.level0;

/*
level-0
팩토리얼

입출력 예
n	    result
3628800	10
7	    3
 */

public class P120848 {
    public static void main(String[] args) {
        int n = 7;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        int tmp = 1;
        int k = 1;

        while (true) {
            tmp *= k;

            if (tmp > n) {
                answer = k;
                break;
            }

            k++;
        }

        return answer - 1;
    }
}
