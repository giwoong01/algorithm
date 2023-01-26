package src.level1;

// level-1
// 과일 장수

import java.util.*;

class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {
            if((score.length - i) % m == 0) answer += score[i] * m;
        }

        return answer;
    }
}

/*
import java.util.*;

class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
 */