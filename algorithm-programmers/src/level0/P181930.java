package src.level0;

/*
level-0
주사위 게임 2

입출력 예
a	b	c	result
2	6	1	9
5	3	3	473
4	4	4	110592
 */

import java.util.Map;

public class P181930 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 1;

        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int b, int c) {
        if (a != b && a !=c && b != c) {
            return a + b + c;
        } else if (a == b && a == c) {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else {
            return (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        }
    }
}
