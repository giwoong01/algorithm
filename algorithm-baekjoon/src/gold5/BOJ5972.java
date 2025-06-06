package gold5;

/*
택배 배송
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BOJ5972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

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
            edges[b].add(new int[] {a, cost});
        }

        int[] distances = dijkstra(N, edges, 1);
        System.out.println(distances[N]);
    }

    public static int[] dijkstra(int N, ArrayList<int[]>[] edges, int start) {
        int[] distances = new int[N + 1];
        Arrays.fill(distances, -1);

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
            distances[node] = distance;

            for (int[] edge : edges[node]) {
                int neighbor = edge[0];
                int cost = edge[1];
                queue.add(new int[] {neighbor, distance + cost});
            }
        }

        return distances;
    }
}
