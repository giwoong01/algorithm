package src.level0;

/*
level-0
중복된 문자 제거

입출력 예
my_string	        result
"people"	        "peol"
"We are the world"	"We arthwold"
 */

import java.util.HashMap;
import java.util.Map;

public class P120888 {
    public static void main(String[] args) {
        String my_string = "people";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (!answer.toString().contains(String.valueOf(c))) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
