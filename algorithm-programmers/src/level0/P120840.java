package src.level0;

/*
level-0
구슬을 나누는 경우의 수

입출력 예
balls	share	result
3	    2	    3
5	    3	    10
 */

import java.math.BigInteger;

public class P120840 {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;

        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        BigInteger combinations = combinations(balls, share);
        return combinations.intValue();
    }

    public static BigInteger combinations(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO;
        }

        if (r == 0 || r == n) {
            return BigInteger.ONE;
        }

        if (r > n / 2) {
            r = n - r;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= r; ++i) {
            result = result.multiply(BigInteger.valueOf(n - i + 1))
                    .divide(BigInteger.valueOf(i));
        }

        return result;
    }
}
