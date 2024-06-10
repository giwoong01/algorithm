package src.level0;

/*
level-0
글자 이어 붙여 문자열 만들기

입출력 예
my_string	            index_list	                                result
"cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
"zpiaz"	                [1, 2, 0, 0, 3]	                            "pizza"
 */

public class P181915 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        System.out.println(solution(my_string, index_list));
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int j : index_list) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }
}
