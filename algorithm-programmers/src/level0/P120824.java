package src.level0;

/*
level-0
짝수 홀수 개수

입출력 예
num_list	    result
[1, 2, 3, 4, 5]	[2, 3]
[1, 3, 5, 7]	[0, 4]
 */

import java.util.Arrays;

public class P120824 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}
