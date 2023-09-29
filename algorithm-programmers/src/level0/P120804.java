package src.level0;

/*
level-0
두 수의 곱

num1	num2	result
3	    4	    12
27	    19	    513
 */

public class P120804 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        return num1 * num2;
    }

}
