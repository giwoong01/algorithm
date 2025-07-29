package src.level0;

/*
level-0
[PCCE 기출문제] 6번 / 가채점

입출력 예
numbers	our_score	score_list	                        result
[1]	    [100]	    [100, 80, 90, 84, 20]	            ["Same"]
[3, 4]	[85, 93]	[85, 92, 38, 93, 48, 85, 92, 56]	["Different", "Same"]
 */

import java.util.Arrays;

public class P250128 {
    public static void main(String[] args) {
        int[] numbers = {1};
        int[] our_score = {100};
        int[] score_list = {100, 80, 90, 84, 20};

        System.out.println(Arrays.toString(solution(numbers, our_score, score_list)));
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

}
