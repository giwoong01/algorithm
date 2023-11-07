package src.level0;

/*
level-0
피자 나눠 먹기(1)

n	result
7	1
1	1
15	3
 */

public class P120814 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        double a = (double) n / 7;
        return (int) Math.ceil(a);

    }
}
