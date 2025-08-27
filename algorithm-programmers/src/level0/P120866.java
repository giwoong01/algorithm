package src.level0;

/*
level-0
안전지대

입출력 예
board	                                                                                                                result
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	                                16
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	                                13
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]] 0
 */

public class P120866 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {
        int answer = 0;
        int[][] result = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int iMin = Math.max(i - 1, 0);
                    int iMax = Math.min(i + 1, board.length - 1);
                    int jMin = Math.max(j - 1, 0);
                    int jMax = Math.min(j + 1, board.length - 1);

                    result[i][j] = 1;
                    result[i][jMin] = 1;
                    result[i][jMax] = 1;

                    result[iMin][jMin] = 1;
                    result[iMin][j] = 1;
                    result[iMin][jMax] = 1;

                    result[iMax][jMin] = 1;
                    result[iMax][j] = 1;
                    result[iMax][jMax] = 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (result[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
