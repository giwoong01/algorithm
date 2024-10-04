package src.level0;

/*
level-0
부분 문자열

입출력 예
str1	str2	    result
"abc"	"aabcc"	    1
"tbt"	"tbbttb"	0
 */

public class P181842 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        if (str2.contains(str1)) {
            return 1;
        }

        return 0;
    }
}
