package src.level1;

// level-1
// 과일 장수

import java.util.*;

class P135808 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(solution(k, m, score));
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {
            if((score.length - i) % m == 0) {
                answer += score[i] * m;
            }
        }

        return answer;
    }
}