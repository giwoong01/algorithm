package src.level0;

/*
level-0
문자열의 앞의 n글자

입출력 예
my_string	        n	result
"ProgrammerS123"	11	"ProgrammerS"
"He110W0r1d"	    5	"He110"
*/

public class P181907 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
