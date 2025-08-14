package src.level0;

/*
level-0
OX퀴즈

입출력 예
quiz	                                                    result
["3 - 4 = -3", "5 + 6 = 11"]	                            ["X", "O"]
["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]
 */

import java.util.Arrays;

public class P120907 {
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(Arrays.toString(solution(quiz)));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");

            int a = Integer.parseInt(split[0].trim());
            int b = Integer.parseInt(split[2].trim());
            int c = Integer.parseInt(split[4].trim());

            if (split[1].equals("+")) {
                answer[i] = (a + b == c) ? "O" : "X";
            } else {
                answer[i] = (a - b == c) ? "O" : "X";
            }
        }

        return answer;
    }
}
