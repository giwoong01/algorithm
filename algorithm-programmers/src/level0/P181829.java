package src.level0;

/*
level-0
이차원 배열 대각선 순회하기

입출력 예
board	                                    k	result
[[0, 1, 2],[1, 2, 3],[2, 3, 4],[3, 4, 5]]	2	8
 */

public class P181829 {
    public static void main(String[] args) {
        int[][] board = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int k = 2;

        System.out.println(solution(board, k));
    }

    public static int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }
}
