package src.level0;

/*
level-0
접미사 배열

입출력 예
my_string	    result
"banana"	    ["a", "ana", "anana", "banana", "na", "nana"]
"programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P181909 {
    public static void main(String[] args) {
        String my_string = "banana";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i));
        }

        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }
}
