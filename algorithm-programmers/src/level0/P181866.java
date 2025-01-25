package src.level0;

/*
level-0
문자열 잘라서 정렬하기

입출력 예
myString	    result
"axbxcxdx"	    ["a","b","c","d"]
"dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]
 */

import java.util.Arrays;

public class P181866 {
    public static void main(String[] args) {
        String myString = "dxccxbbbxxaaaa";

        System.out.println(Arrays.toString(solution(myString)));
    }

    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
