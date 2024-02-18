package src.level1;

/*
level-1
[PCCE 기출문제] 9번 / 이웃한 칸

입출력 예
board	                                                                                                                                    h	w	result
[["blue", "red", "orange", "red"], ["red", "red", "blue", "orange"], ["blue", "orange", "red", "red"], ["orange", "orange", "red", "blue"]]	1	1	2
[["yellow", "green", "blue"], ["blue", "green", "yellow"], ["yellow", "blue", "blue"]]	                                                    0	1	1
 */

import java.util.Objects;

public class P250125 {
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

        System.out.println(solution(board, h, w));
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i <= 3; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (Objects.equals(board[h][w], board[h_check][w_check])) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
