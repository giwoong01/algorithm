package src.level0;

/*
level-0
배열 뒤집기

num_list	            result
[1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
[1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 */

import java.util.Arrays;

public class P120821 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - 1 - i];
        }

        return answer;
    }
}
