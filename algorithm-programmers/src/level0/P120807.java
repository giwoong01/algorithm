package src.level0;

/*
level-0
숫자 비교하기

num1	num2	result
2	    3	    -1
11	    11	    1
7	    99	    -1
 */

public class P120807 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        System.out.println(solution(num1, num2));
    }
    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
