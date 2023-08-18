package src.level2;

/*
level-2
기능 개발

progresses	                speeds	            return
[93, 30, 55]	            [1, 30, 5]	        [2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
 */

import java.util.*;

public class P42586 {
    public static void main(String[] args) {
        int[] progresses = {96, 94};
        int[] speeds = {3, 3};

        System.out.println(solution(progresses, speeds));
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];

            int count = 0;
            for (int j = 1; j <= progresses[i]; j += speeds[i]) {
                count++;
            }

            arr[i] = count;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            if (!queue.isEmpty() && queue.peek() < arr[i]) {
                list.add(queue.size());
                queue.clear();
            }

            queue.add(arr[i]);
        }

        if (!queue.isEmpty()) {
            list.add(queue.size());
        }

        return list;
    }
}
