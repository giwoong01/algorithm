package src.level0;

/*
level-0
n의 배수

입출력 예
num	n	result
98	2	1
34	3	0
 */

public class P181937 {
    public static void main(String[] args) {
        int num = 98;
        int n = 2;

        System.out.println(solution(num, n));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
