package src.level0;

/*
level-0
n보다 커질 때까지 더하기

입출력 예
numbers	                    n	    result
[34, 5, 71, 29, 100, 34]	123	    139
[58, 44, 27, 10, 100]	    139	    239
 */

public class P181884 {
    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        System.out.println(solution(numbers, n));
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                break;
            }
        }

        return answer;
    }
}
