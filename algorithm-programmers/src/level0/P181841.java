package src.level0;

/*
level-0
꼬리 문자열

입출력 예
str_list	             ex	    result
["abc", "def", "ghi"]	"ef"	"abcghi"
["abc", "bbc", "cbc"]	"c"	    ""
 */

public class P181841 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        System.out.println(solution(str_list, ex));
    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (String s : str_list) {
            if (s.contains(ex)) {
                continue;
            }

            sb.append(s);
        }

        return sb.toString();
    }

}
