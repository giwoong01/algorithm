package src.level0;

/*
level-0
카운트 업

입출력 예
start_num	end_num	    result
3	        10	        [3, 4, 5, 6, 7, 8, 9, 10]
 */

import java.util.Arrays;

public class P181920 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int index = 0;

        for (int i = start_num; i <= end_num; i++) {
            answer[index++] = i;
        }

        return answer;
    }
}
