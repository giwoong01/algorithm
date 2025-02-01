package src.level0;

/*
level-0
세로 읽기

입출력 예
my_string	            m	c	result
"ihrhbakrfpndopljhygc"	4	2	"happy"
"programmers"	        1	1	"programmers"
 */

public class P181904 {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;

        System.out.println(solution(my_string, m, c));
    }

    public static String solution(String my_string, int m, int c) {
        String[] strArr = new String[my_string.length() / m];
        int index = 0;
        for (int i = 0; i < my_string.length(); i += m) {
            strArr[index++] = my_string.substring(i, i + m);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s.charAt(c - 1));
        }

        return String.valueOf(sb);
    }
}
