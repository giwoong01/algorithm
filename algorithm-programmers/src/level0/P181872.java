package src.level0;

/*
level-0
특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

입출력 예
myString	pat	    result
"AbCdEFG"	"dE"	"AbCdE"
"AAAAaaaa"	"a"	    "AAAAaaaa"
 */

import java.util.ArrayList;
import java.util.List;

public class P181872 {
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";

        System.out.println(solution(myString, pat));
    }

    public static String solution(String myString, String pat) {
        String answer = "";

        for (int i = 0; i < myString.length() + 1; i++) {
            String substring = myString.substring(0, i);

            if (substring.endsWith(pat)) {
                answer = substring;
            }
        }

        return answer;
    }
}
