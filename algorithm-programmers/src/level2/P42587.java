package src.level2;

/*
level-2
프로세스

입출력 예
priorities	        location	return
[2, 1, 3, 2]	    2	        1
[1, 1, 9, 1, 1, 1]	0	        5

프로세스 스케줄링은 우선순위 큐를 사용한다.
자바에서는 우선순위 큐(PriorityQueue)를 제공한다.
Queue와 사용법은 같지만 우선순위 큐는 기본적으로 우선순위가 낮은 값부터 저장된다.
우선순위가 높은 것이 맨 앞으로 오게 Collections.reverseorder()를 사용하여 우선순위가 높은 순으로 만들어준다.

큐가 비어있지 않는 동안 로직을 반복한다.
큐의 맨 앞에 있는 요소와 priorities[i]의 요소가 같다면,
큐의 맨 앞에 요소를 꺼내서 제거하고, 카운트(answer)를 증가한다.
위의 과정을 반복하면서 현재 인덱스 i가 찾으려는 위치인(location)과 같다면 카운트(answer)를 반환한다.

우선순위 큐를 이용해 특정 위치의 요소가 처리될 때 까지 반복하며, 처리된 요소의 개수를 세는 로직
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class P42587 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
