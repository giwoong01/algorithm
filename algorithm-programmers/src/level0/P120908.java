package src.level0;

/*
level-0
문자열안에 문자열

입출력 예
str1	                    str2	result
"ab6CDE443fgh22iJKlmn1o"	"6CD"	1
"ppprrrogrammers"	        "pppp"	2
"AbcAbcA"	                "AAA"	2
 */

public class P120908 {
    public static void main(String[] args) {
        String str1 ="ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
