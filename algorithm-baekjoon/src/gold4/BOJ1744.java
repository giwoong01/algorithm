package gold4;

/*
수 묶기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> positivePQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negativePQ = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                positivePQ.add(x);
            } else {
                negativePQ.add(x);
            }
        }

        int result = 0;

        while (!positivePQ.isEmpty()) {
            Integer n1 = positivePQ.poll();
            Integer n2 = positivePQ.poll();

            if (n1 == null) {
                break;
            }

            if (n2 == null) {
                result += n1;
            } else if (n2 == 1) {
                result += n1 + n2;
            } else {
                result += n1 * n2;
            }
        }

        while (!negativePQ.isEmpty()) {
            Integer n1 = negativePQ.poll();
            Integer n2 = negativePQ.poll();

            if (n1 == null) {
                break;
            }

            if (n2 == null) {
                result += n1;
            } else {
                result += n1 * n2;
            }
        }

        System.out.println(result);
    }
}