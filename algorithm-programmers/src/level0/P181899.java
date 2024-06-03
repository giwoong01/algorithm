package src.level0;

/*
level-0
카운트 다운

입출력 예
start_num	end_num	    result
10	        3	        [10, 9, 8, 7, 6, 5, 4, 3]
 */

import java.util.Arrays;

public class P181899 {
    public static void main(String[] args) {
        int start = 10;
        int end_num = 3;

        System.out.println(Arrays.toString(solution(start, end_num)));
    }

    public static int[] solution(int start, int end_num) {
        int[] answer = new int[(start - end_num) + 1];
        int index = 0;

        for (int i = start; i >= end_num; i--) {
            answer[index++] = i;
        }

        return answer;
    }
}
