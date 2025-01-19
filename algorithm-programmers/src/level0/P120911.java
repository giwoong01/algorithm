package src.level0;

/*
level-0
문자열 정렬하기 (2)

입출력 예
my_string	result
"Bcad"	    "abcd"
"heLLo"	    "ehllo"
"Python"	"hnopty"
 */

import java.util.Arrays;

public class P120911 {
    public static void main(String[] args) {
        String my_string = "Bcad";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        char[] charArray = my_string.toLowerCase().toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}
