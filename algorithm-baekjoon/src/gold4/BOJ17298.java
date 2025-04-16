package gold4;

/*
오큰수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            while (!deque.isEmpty() && seq[deque.peek()] < seq[i]) {
                seq[deque.pop()] = seq[i];
            }

            deque.push(i);
        }

        while (!deque.isEmpty()) {
            seq[deque.pop()] = -1;
        }

        for (int i = 0; i < N; i++) {
            sb.append(seq[i]).append(" ");
        }

        System.out.println(sb);
    }
}
