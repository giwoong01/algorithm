package src.level0;

/*
level-0
삼각형의 완성조건 (1)

입출력 예
sides	        result
[1, 2, 3]	    2
[3, 6, 2]	    2
[199, 72, 222]	1
 */

import java.util.Arrays;

public class P120889 {
    public static void main(String[] args) {
        int[] sides = {1,2,3};

        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
