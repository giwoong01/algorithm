package src.level1;

// level-1
// 문자열 내 마음대로 정렬하기

// 입출력 예
// strings	                n	return
// ["sun", "bed", "car"]	1	["car", "bed", "sun"]
// ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]

import java.util.Arrays;

public class P12915 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);

            strings[i] = c + strings[i];
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
