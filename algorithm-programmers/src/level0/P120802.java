package src.level0;

/*
level-0
두 수의 합

num1	num2	result
2	    3	    5
100	    2	    102
 */

public class P120802 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        return num1 + num2;
    }
}
