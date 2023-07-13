package src.level0;

/*
level-0
문자열 겹쳐쓰기

입출력 예
my_string	        overwrite_string	s	result
"He11oWor1d"	    "lloWorl"   	    2	"HelloWorld"
"Program29b8UYP"	"merS123"	        7	"ProgrammerS123"
 */

public class P181943 {
    public static void main(String[] args) {
        String myString = "He11oWor1d";
        String overwriteString = "lloWorl";
        int s = 2;

        System.out.println(solution(myString, overwriteString, s));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
    }
}
