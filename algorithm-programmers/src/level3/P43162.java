package src.level3;

/*
level-3
네트워크 (DFS/BFS)

입출력 예
n	computers	                        return
3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
 */

import java.util.LinkedList;
import java.util.Queue;

public class P43162 {
    static boolean[] visit;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution(n, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];


        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                BFS(i, computers, n);
                answer++;
            }
        }

        return answer;
    }

    private static void BFS(int i, int[][] computers, int n) {
        q.offer(i);
        visit[i] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int j = 0; j < n; j++) {
                if (!visit[j] && computers[temp][j] == 1) {
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }

    /*
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                answer++;
                DFS(i, computers, n);
            }
        }

        return answer;
    }

    private static void DFS(int i, int[][] computers, int n) {
        visit[i] = true;

        for (int j = 0; j < n; j++) {
            if (!visit[j] && computers[i][j] == 1) {
                DFS(j, computers, n);
            }
        }
    }
     */

}
