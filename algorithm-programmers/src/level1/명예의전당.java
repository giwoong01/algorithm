package src.level1;

// level-1
// 명예의 전당(1)

import java.util.*;

class 명예의전당 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> sc = new ArrayList();
        for(int i = 0; i < score.length; i++) {
            if(i < k - 1) {
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder());
                answer[i] = sc.get(sc.size() - 1);
            }
            else if(i >= k - 1) {
                sc.add(score[i]);
                sc.sort(Collections.reverseOrder());
                answer[i] = sc.get(k - 1);
            }
        }

        return answer;
    }
}