package src.level0;

/*
level-0
ad 제거하기

입출력 예
strArr	                        result
["and","notad","abcd"]	        ["and","abcd"]
["there","are","no","a","ds"]	["there","are","no","a","ds"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181870 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};

        System.out.println(Arrays.toString(solution(strArr)));
    }

    public static String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                answer.add(s);
            }
        }

        return answer.toArray(new String[0]);
    }
}
