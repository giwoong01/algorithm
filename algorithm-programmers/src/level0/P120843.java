package src.level0;

/*
level-0
공 던지기

입출력 예
numbers	            k	result
[1, 2, 3, 4]	    2	3
[1, 2, 3, 4, 5, 6]	5	3
[1, 2, 3]	        3	2
 */

public class P120843 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        System.out.println(solution(numbers, k));
    }

    public static int solution(int[] numbers, int k) {
        int answer;
        int index = 0;

        for (int i = 1; i < k; i++) {
            index += 2;
        }

        index %= numbers.length;
        answer = numbers[index];

        return answer;
    }
}
