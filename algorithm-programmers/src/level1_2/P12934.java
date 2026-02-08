package src.level1_2;

/*
입출력 예
n	return
121	144
3	-1
 */

public class P12934 {
    public static void main(String[] args) {
        int n = 121;

        System.out.println(solution(n));
    }

    public static long solution(long n) {
        if ((long) Math.pow((long) Math.sqrt(n), 2) == n) {
            return (long) Math.pow((long) Math.sqrt(n) + 1, 2);
        }

        return -1;
    }
}
