package src.level2;

/*
level-2
다리를 지나는 트럭

입출력 예
bridge_length	weight	truck_weights	                return
2	            10	    [7,4,5,6]	                    8
100	            100	    [10]	                        101
100	            100	    [10,10,10,10,10,10,10,10,10,10]	110

다리를 건너는 트럭을 담은 [[큐(Queue)]]인 `Queue` 변수 선언.
다리를 건너고 있는 트럭의 시간을 담은 `sum` 변수 선언.

트럭을 하나 씩 순환 하면서 3가지의 경우를 생각해 봐야한다.
1. 큐가 비어있는 경우
2. 큐가 가득 찬 경우
3. 큐가 가득 차지 않은 경우 (weight 보다 작다.)

1. 큐가 비어 있는 경우
큐가 비어있으면 큐에 트럭을 추가하고, 다리를 건너고 있는 트럭의 시간에 트럭의 무게를 더해준다. (sum)
그리고 시간을 추가한다.

2. 큐가 가득 찬 경우
큐의 사이즈와 다리의 길이가 같을 때,
sum에서 큐의 첫번째 요소를 빼준다.

3. 큐가 가득 차지 않은 경우
첫번째로, 기존의 sum과 트럭의 무게를 더 했을 때 weight를 넘지 않을 때
두번째로, 그 외를 생각해야 한다.

첫번째의 경우 큐가 비어 있는 경우와 같다.
두번째의 경우 큐를 가득차게 만들어 준 후 시간을 추가한다.

그리고 마지막으로 시간과 다리의 길이를 더해준다.
 */

import java.util.LinkedList;
import java.util.Queue;

public class P42583 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(truckWeight);
                    sum += truckWeight;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    if (sum + truckWeight <= weight) {
                        queue.add(truckWeight);
                        sum += truckWeight;
                        answer++;
                        break;
                    } else {
                        queue.add(0);
                        answer++;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
