package src.level1_2;

/*
입출력 예
x	return
10	true
12	true
11	false
13	false
 */

public class P12947 {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        while(tmp > 0) {
            sum += tmp % 10;
            tmp = tmp / 10;
        }

        return x % sum == 0;
    }
}
