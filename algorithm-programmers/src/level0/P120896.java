package src.level0;

/*
level-0
한 번만 등장한 문자

입출력 예
s	        result
"abcabcadc"	"d"
"abdc"	    "abcd"
"hello"	    "eho"
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P120896 {
    public static void main(String[] args) {
        String s = "abcabcadc";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<String> strList = new ArrayList<>();
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                strList.add(String.valueOf(c));
            }
        }

        Collections.sort(strList);
        StringBuilder sb = new StringBuilder();
        for (String string : strList) {
            sb.append(string);
        }

        return sb.toString();
    }
}
