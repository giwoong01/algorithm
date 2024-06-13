package src.level0;

/*
level-0
마지막 두 원소

입출력 예
num_list	        result
[2, 1, 6]	        [2, 1, 6, 5]
[5, 2, 1, 7, 5]	    [5, 2, 1, 7, 5, 10]
 */

import java.util.Arrays;

public class P181927 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }
}
