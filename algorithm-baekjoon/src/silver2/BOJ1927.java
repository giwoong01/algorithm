package silver2;

/*
최소 힙
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                pq.add(x);
            } else {
                Integer poll = pq.poll();
                if (poll == null) {
                    System.out.println(0);
                    continue;
                }

                System.out.println(poll);
            }
        }
    }
}
