package src.level0;

/*
level-0
소문자로 바꾸기

입출력 예
myString	result
"aBcDeFg"	"abcdefg"
"aaa"	    "aaa"
 */

public class P181876 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
