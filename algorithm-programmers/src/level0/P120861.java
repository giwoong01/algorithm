package src.level0;

/*
level-0
캐릭터의 좌표

입출력 예
keyinput	                                board	    result
["left", "right", "up", "right", "right"]	[11, 11]	[2, 1]
["down", "down", "down", "down", "down"]	[7, 9]	    [0, -4]
 */

import java.util.Arrays;

public class P120861 {
    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int 가로 = 0;
        int 세로 = 0;
        for (String s : keyinput) {
            if (s.equals("left")) {
                if (가로 <= -(board[0] / 2)) {
                    continue;
                }

                가로--;
            } else if (s.equals("right")) {
                if (가로 >= board[0] / 2) {
                    continue;
                }

                가로++;
            } else if (s.equals("up")) {
                if (세로 >= board[1] / 2) {
                    continue;
                }

                세로++;
            } else {
                if (세로 <= -(board[1] / 2)) {
                    continue;
                }

                세로--;
            }
        }

        return new int[]{가로, 세로};
    }

}
