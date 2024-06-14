package src.level0;

/*
level-0
문자열의 뒤의 n글자

입출력 예
my_string	        n	result
"ProgrammerS123"	11	"grammerS123"
"He110W0r1d"	    5	"W0r1d"
 */

public class P181910 {
    public static void main(String[] args) {
        String my_string = "He110W0r1d";
        int n = 5;

        System.out.println(solution(my_string, n));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
