package src.level0;

/*
level-0
접미사인지 확인하기

입출력 예
my_string	is_suffix	result
"banana"	"ana"	    1
"banana"	"nan"	    0
"banana"	"wxyz"	    0
"banana"	"abanana"	0
 */

public class P181908 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";

        System.out.println(solution(my_string, is_suffix));
    }

    public static int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
