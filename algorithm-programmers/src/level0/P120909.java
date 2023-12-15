package src.level0;

/*
level-0
제곱수 판별하기

n	result
144	1
976	2
 */

public class P120909 {
    public static void main(String[] args) {
        int n = 144;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
