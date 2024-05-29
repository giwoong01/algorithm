package src.level0;

/*
level-0
n 번째 원소까지

입출력 예
num_list	        n	result
[2, 1, 6]	        1	[2]
[5, 2, 1, 7, 5]	    3	[5, 2, 1]
 */

import java.util.Arrays;

public class P181889 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
