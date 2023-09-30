package src.level0;

/*
level-0
두 수의 차

num1	num2	result
2	    3	    -1
100	    2	    98
 */

public class P120803 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
