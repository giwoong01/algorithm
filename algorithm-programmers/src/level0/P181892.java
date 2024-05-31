package src.level0;

/*
level-0
n 번째 원소부터

입출력 예
num_list	        n	    result
[2, 1, 6]	        3	    [6]
[5, 2, 1, 7, 5]	    2	    [2, 1, 7, 5]
 */

import java.util.Arrays;

public class P181892 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int n = 3;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - n) + 1];
        int index = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        return answer;
    }
}
