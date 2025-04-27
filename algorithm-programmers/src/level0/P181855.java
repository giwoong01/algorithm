package src.level0;

/*
level-0
문자열 묶기

입출력 예
strArr	                    result
["a","bc","d","efg","hi"]	2
 */

import java.util.HashMap;
import java.util.Map;

public class P181855 {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println(solution(strArr));
    }

    public static int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (String s : strArr) {
            map.put(s.length(), map.getOrDefault(s.length(), 0) + 1);
        }

        for (Integer value : map.values()) {
            answer = Math.max(value, answer);
        }

        return answer;
    }
}
