package src.level1;

/*
level-1
명예의 전당(1)

k	score	                                        result
3	[10, 100, 20, 150, 1, 100, 200]	                [10, 10, 10, 20, 20, 100, 100]
4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
 */

import java.util.*;

class P138477 {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(solution2(k, score)));
    }

    public static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);
                list.sort(Comparator.reverseOrder());
                answer[i] = list.get(i);
            } else {
                list.add(score[i]);
                list.sort(Comparator.reverseOrder());
                answer[i] = list.get(k - 1);
            }
        }

        return answer;
    }
}