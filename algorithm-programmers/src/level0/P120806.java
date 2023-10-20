package src.level0;

/*
level-0
두 수의 나눗셈

num1	num2	result
3	    2	    1500
7	    3	    2333
1	    16	    62
 */

public class P120806 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        double num = (double) num1 / num2 * 1000;
        return (int) num;
    }
}
