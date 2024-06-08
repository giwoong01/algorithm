package src.level0;

/*
level-0
접두사인지 확인하기

입출력 예
my_string	is_prefix	result
"banana"	"ban"	    1
"banana"	"nan"	    0
"banana"	"abcd"	    0
"banana"	"bananan"	0
 */

public class P181906 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        System.out.println(solution(my_string, is_prefix));
    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 1;

        if (my_string.length() < is_prefix.length()) return 0;

        for (int i = 0; i < is_prefix.length(); i++) {
            if (is_prefix.charAt(i) != my_string.charAt(i)) {
                return 0;
            }
        }

        return answer;
    }
}
