package src.level2;

/*
level-2
문자열 압축

입출력 예
s	                        result
"aabbaccc"	                7
"ababcdcdababcdcd"	        9
"abcabcdede"	            8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	        17
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P60057 {
    public static void main(String[] args) {
        String s = "aabbaccc";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 1000;

        int unit = 1;
        while (unit != s.length()) {
            List<String> strList = new ArrayList<>();

            String str = s;
            for (int i = 0; i < s.length() - unit + 1; i = i + unit) {
                String substring = s.substring(i, i + unit);
                strList.add(substring);

                str = str.substring(unit);
            }

            if (!str.isEmpty()) {
                strList.add(str);
            }

            Stack<String> stringStack = new Stack<>();
            Stack<Integer> integerStack = new Stack<>();
            String prev = "";
            int count = 0;

            for (String string : strList) {
                if (string.equals(prev)) {
                    count++;
                } else {
                    if (!prev.isEmpty()) {
                        stringStack.push(prev);
                        integerStack.push(count);
                    }
                    prev = string;
                    count = 1;
                }
            }

            if (!prev.isEmpty()) {
                stringStack.push(prev);
                integerStack.push(count);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stringStack.size(); i++) {
                String key = stringStack.get(i);
                int value = integerStack.get(i);
                if (value == 1) {
                    sb.append(key);
                } else {
                    sb.append(value).append(key);
                }
            }

            answer = Math.min(sb.length(), answer);
            unit++;
        }

        return answer == 1000 ? 1 : answer;
    }
}
