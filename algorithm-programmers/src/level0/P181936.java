package src.level0;

/*
level-0
공배수

입출력 예
number	n	m	result
60	    2	3	1
55	    10	5	0
 */

public class P181936 {
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;

        System.out.println(solution(number, n, m));
    }

    public static int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }

        return 0;
    }
}
