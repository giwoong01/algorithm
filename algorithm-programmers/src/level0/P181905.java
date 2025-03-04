package src.level0;

/*
level-0
문자열 뒤집기

입출력 예
my_string	        s	e	result
"Progra21Sremm3"	6	12	"ProgrammerS123"
"Stanley1yelnatS"	4	10	"Stanley1yelnatS"
 */

public class P181905 {
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;

        System.out.println(solution(my_string, s, e));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();

        String start = my_string.substring(0, s);
        String end = my_string.substring(e + 1);

        return start + sb + end;
    }
}
