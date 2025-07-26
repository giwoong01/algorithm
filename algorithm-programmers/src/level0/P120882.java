package src.level0;

/*
level-0
등수 매기기

입출력 예
score	                                                                    result
[[80, 70], [90, 50], [40, 70], [50, 80]]	                                [1, 2, 4, 3]
[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P120882 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        System.out.println(Arrays.toString(solution(score)));
    }

    public static int[] solution(int[][] score) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : score) {
            list.add(ints[0] + ints[1]);
        }

        list.sort(Collections.reverseOrder());

        int[] answer = new int[list.size()];
        for (int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }
}
