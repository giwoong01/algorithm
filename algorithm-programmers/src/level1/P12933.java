package src.level1;

// level-1
// 정수 내림차순으로 배치하기

import java.util.Arrays;
import java.util.Collections;

public class P12933 {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        String answ = "";

        for (String s : str) {
            answ += s;
        }
        answer = Long.parseLong(answ);

        return answer;
    }
}
