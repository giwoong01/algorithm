package src.level0;

/*
level-0
원하는 문자열 찾기

입출력 예
myString	pat	    return
"AbCdEfG"	"aBc"	1
"aaAA"	    "aaaaa"	0
 */

public class P181878 {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            return 1;
        }

        return 0;
    }
}
