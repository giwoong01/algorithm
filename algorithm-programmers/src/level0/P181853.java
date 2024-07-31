package src.level0;

/*
level-0
뒤에서 5등까지

입출력 예
num_list	                result
[12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 */

import java.util.Arrays;

public class P181853 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int idx = 0;

        Arrays.sort(num_list);
        for (int i = 0; i < 5; i++) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}
