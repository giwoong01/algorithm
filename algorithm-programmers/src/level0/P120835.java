package src.level0;

/*
level-0
진료순서 정하기

입출력 예
emergency	            result
[3, 76, 24]	            [3, 1, 2]
[1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
[30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
 */

import java.util.Arrays;

public class P120835 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        System.out.println(Arrays.toString(solution(emergency)));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int k : emergency) {
                if (emergency[i] < k) {
                    answer[i]++;
                }
            }

            answer[i]++;
        }

        return answer;
    }
}
