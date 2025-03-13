package src.level0;

/*
level-0
A로 B 만들기

입출력 예
before	after	result
"olleh"	"hello"	1
"allpe"	"apple"	0
 */

import java.util.Arrays;

public class P120886 {
    public static void main(String[] args) {
        String before = "allpe";
        String after = "apple";

        System.out.println(solution(before, after));
    }

    public static int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}
