package src.level0;

/*
level-0
분수의 덧셈

입출력 예
numer1	denom1	numer2	denom2	result
1	    2	    3	    4	    [5, 4]
9	    2	    1	    3	    [29, 6]
 */

import java.util.Arrays;

public class P120808 {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int demon2 = 4;

        System.out.println(Arrays.toString(solution(numer1, denom1, numer2, demon2)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int max = 1;
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }

        numer = numer / max;
        denom = denom / max;

        return new int[]{numer, denom};
    }
}
