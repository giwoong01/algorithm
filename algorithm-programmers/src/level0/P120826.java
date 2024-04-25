package src.level0;

/*
level-0
특정 문자 제거하기

입출력 예
my_string	letter	result
"abcdef"	"f"	    "abcde"
"BCBdbe"	"B"	    "Cdbe"
 */

public class P120826 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";

        System.out.println(solution(my_string, letter));
    }

    public static String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();

        String[] str = my_string.split(letter);
        for(String s : str) {
            answer.append(s);
        }

        return answer.toString();
    }
}
