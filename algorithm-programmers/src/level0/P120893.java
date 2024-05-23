package src.level0;

/*
level-0
대문자와 소문자

입출력 예
my_string	    result
"cccCCC"	    "CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"
 */

public class P120893 {
    public static void main(String[] args) {

    }

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }

        }

        return answer.toString();
    }
}
