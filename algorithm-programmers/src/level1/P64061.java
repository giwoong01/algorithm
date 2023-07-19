package src.level1;

/*
level-1
크레인 인형뽑기 게임

입출력 예
board	                                                        moves	            result
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4

0 0 0 0 0       0 0 0 0 0
0 0 1 0 3       0 0 0 0 0
0 2 5 0 1  ->   0 0 5 0 0
4 2 4 4 2       0 2 4 0 2
3 5 1 3 1       0 5 1 1 1
 */

import java.util.Stack;

public class P64061 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int k = 0; k < moves.length; k++) {
            int a = moves[k] - 1;

            for(int i = 0; i < board.length; i++) {
                if (!stack.isEmpty() && stack.peek() == board[i][a]) {
                    stack.pop();
                    board[i][a] = 0;
                    answer += 2;
                    break;
                }

                if (board[i][a] != 0) {
                    stack.push(board[i][a]);
                    board[i][a] = 0;
                    break;
                }
            }

        }

        return answer;
    }
}
