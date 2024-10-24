package src.level0;

/*
level-0
최댓값 만들기 (2)

입출력 예
numbers	                    result
[1, 2, -3, 4, -5]	        15
[0, -31, 24, 10, 1, 9]	    240
[10, 20, 30, 5, 5, 20, 5]	600
 */

public class P120862 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    answer = Math.max(answer, numbers[i] * numbers[j]);
                }
            }
        }

        return answer;
    }
}
