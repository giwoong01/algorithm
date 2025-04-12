package gold4;

/*
카드 정렬하기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int result = 0;
        while (pq.size() > 1) {
            int num1 = pq.poll();
            int num2 = pq.poll();

            int sum = num1 + num2;
            result += sum;
            pq.add(sum);
        }

        System.out.println(result);
    }
}
