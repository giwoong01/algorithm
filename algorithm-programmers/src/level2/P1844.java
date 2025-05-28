package src.level2;

/*
level-2
게임 맵 최단거리

입출력 예
maps	                                                        answer
[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
[[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class P1844 {
    static int ROW, COL;
    static int[][] A;

    public static void main(String[] args) {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps) {
        ROW = maps.length;
        COL = maps[0].length;
        A = maps;

        return BFS();
    }

    public static int BFS() {
        boolean[][] visited = new boolean[ROW][COL];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int r = u[0];
            int c = u[1];
            int distance = u[2];

            if (r == ROW - 1 && c == COL - 1) {
                return distance;
            }

            if (r > 0 && !visited[r - 1][c] && A[r - 1][c] == 1) {
                queue.add(new int[]{r - 1, c, distance + 1});
                visited[r - 1][c] = true;
            }

            if (c > 0 && !visited[r][c - 1] && A[r][c - 1] == 1) {
                queue.add(new int[]{r, c - 1, distance + 1});
                visited[r][c - 1] = true;
            }

            if (r < ROW - 1 && !visited[r + 1][c] && A[r + 1][c] == 1) {
                queue.add(new int[]{r + 1, c, distance + 1});
                visited[r + 1][c] = true;
            }

            if (c < COL - 1 && !visited[r][c + 1] && A[r][c + 1] == 1) {
                queue.add(new int[]{r, c + 1, distance + 1});
                visited[r][c + 1] = true;
            }
        }

        return -1;
    }
}
