package src.level0;

/*
level-0
양꼬치

n	k	result
10	3	124,000
64	6	768,000
 */

public class P120830 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        if (n >= 10) {
            k -= n / 10;
        }

        return (n * 12000) + (k * 2000);
    }
}
