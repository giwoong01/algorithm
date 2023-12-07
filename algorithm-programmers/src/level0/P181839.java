package src.level0;

/*
level-0
주사위 게임 1

입출력 예
a	b	result
3	5	34
6	1	14
2	4	2
*/

public class P181839 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        if (a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
}
