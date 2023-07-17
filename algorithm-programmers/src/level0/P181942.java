package src.level0;

/*
level-0
문자열 섞기

입출력 예
str1	str2	result
"aaaaa"	"bbbbb"	"ababababab"
 */

public class P181942 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str1.length() + str2.length(); i++) {
            if (i % 2 == 0) {
                answer.append(str1.charAt(i / 2));
            } else {
                answer.append(str2.charAt(i / 2));
            }
        }

        return answer.toString();
    }
}
