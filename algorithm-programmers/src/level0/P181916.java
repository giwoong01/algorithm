package src.level0;

/*
level-0
주사위 게임 3

입출력 예
a	b	c	d	result
2	2	2	2	2222
4	1	4	4	1681
6	3	3	6	27
2	5	2	6	30
6	4	2	5	2
 */

import java.util.Arrays;

public class P181916 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;

        System.out.println(solution(a, b, c, d));
    }

    public static int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];

        return
                a == d ? a * 1111 :
                        a == c ? (10 * a + d) * (10 * a + d) :
                                b == d ? (10 * b + a) * (10 * b + a) :
                                        a == b & c == d ? c * c - a * a :
                                                a == b ? c * d :
                                                        b == c ? a * d :
                                                                c == d ? a * b :
                                                                        a;
    }
}
