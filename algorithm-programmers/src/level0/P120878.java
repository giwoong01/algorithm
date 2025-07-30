package src.level0;

/*
level-0
유한소수 판별하기

입출력 예
a	b	result
7	20	1
11	22	1
12	21	2
 */

public class P120878 {
    public static void main(String[] args) {
        int a = 1;
        int b = 35;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        b /= gcp(a ,b);

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        return b == 1 ? 1 : 2;
    }

    private static int gcp(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

}
