package gold5;

/*
최소비용 구하기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class BOJ1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<int[]>[] edges = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int cost = Integer.parseInt(split[2]);

            edges[a].add(new int[] {b, cost});
        }

        String[] startAndEnd = br.readLine().split(" ");
        int start = Integer.parseInt(startAndEnd[0]);
        int end = Integer.parseInt(startAndEnd[1]);

        System.out.println(dijkstra(N, edges, start, end));
    }

    public static int dijkstra(int N, ArrayList<int[]>[] edges, int start, int goal) {
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        queue.add(new int[] {start, 0});

        while (!queue.isEmpty()) {
            int[] u = queue.remove();
            int node = u[0];
            int distance = u[1];

            if (visited[node]) {
                continue;
            }

            visited[node] = true;

            if (node == goal) {
                return distance;
            }

            for (int[] edge : edges[node]) {
                int neighbor = edge[0];
                int cost = edge[1];
                queue.add(new int[] {neighbor, distance + cost});
            }
        }

        return -1;
    }

}
