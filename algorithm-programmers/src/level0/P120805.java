package src.level0;

/*
level-0
몫 구하기

num1	num2	result
10	    5	    2
7	    2	    3
 */
public class P120805 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println(solution(num1, num2));
    }
    public static int solution(int num1, int num2) {
        return num1 / num2;
    }
}
