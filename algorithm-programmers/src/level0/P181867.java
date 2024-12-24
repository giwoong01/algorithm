package src.level0;

/*
level-0
x 사이의 개수

입출력 예
myString	    result
"oxooxoxxox"	[1, 2, 1, 0, 1, 0]
"xabcxdefxghi"	[0, 3, 3, 3]
 */

import java.util.Arrays;

public class P181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";

        System.out.println(Arrays.toString(solution(myString)));
    }

    public static int[] solution(String myString) {
        String[] split = myString.split("x", -1);
        int[] answer = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            answer[i] = split[i].length();
        }

        return answer;
    }
}
