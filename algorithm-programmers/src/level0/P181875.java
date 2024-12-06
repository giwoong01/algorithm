package src.level0;

/*
level-0
배열에서 문자열 대소문자 변환하기

입출력 예
strArr	                    result
["AAA","BBB","CCC","DDD"]	["aaa","BBB","ccc","DDD"]
["aBc","AbC"]	            ["abc","ABC"]
 */

import java.util.Arrays;

public class P181875 {
    public static void main(String[] args) {
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};

        System.out.println(Arrays.toString(solution(strArr)));
    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }

        return answer;
    }
}
