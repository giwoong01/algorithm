package src.level1;

// level-1
// 문자열 내림차순으로 배치하기

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());

        for (String value : str) {
            answer.append(value);
        }

        return answer.toString();
    }
}
