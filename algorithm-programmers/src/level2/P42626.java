package src.level2;

/*
level-2
더 맵게

입출력 예
scoville	            K	return
[1, 2, 3, 9, 10, 12]	7	2
 */

import java.util.PriorityQueue;

public class P42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.size() > 1 && K > pq.peek()) {
            answer++;
            int firstMin = pq.remove();
            int secondMin = pq.remove();

            int sum = firstMin + secondMin * 2;
            System.out.println(pq);
            pq.add(sum);
            System.out.println(pq);
        }

        if (pq.peek() < K) {
            return -1;
        }

        return answer;
    }
}
