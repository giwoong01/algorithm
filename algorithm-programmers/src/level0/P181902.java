package src.level0;

/*
level-0
문자 개수 세기

입출력 예
my_string	    result
"Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
 */

import java.util.Arrays;

public class P181902 {
    public static void main(String[] args) {
        String my_string = "Programmers";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c > 64 && c < 91) {
                answer[c - 65]++;
            } else {
                answer[c - 71]++;
            }
        }
        return answer;
    }
}
