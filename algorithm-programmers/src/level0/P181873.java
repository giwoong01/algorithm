package src.level0;

/*
level-0
특정한 문자를 대문자로 바꾸기

입출력 예
my_string	    alp	    result
"programmers"	"p"	    "Programmers"
"lowercase"	    "x"	    "lowercase"
 */

public class P181873 {
    public static void main(String[] args) {
        String my_string = "programmers";
        char alp = 'p';

        System.out.println(solution(my_string, alp));
    }

    public static String solution(String my_string, char alp) {
        return my_string.replaceAll(String.valueOf(alp), String.valueOf(alp).toUpperCase());
    }
}
