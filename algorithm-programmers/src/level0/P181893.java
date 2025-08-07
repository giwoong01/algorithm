package src.level0;

/*
level-0
배열 조각하기

입출력 예
arr	                query	    result
[0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181893 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};

        System.out.println(Arrays.toString(solution(arr, query)));
    }

    public static int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            list.add(i);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list = list.subList(0, query[i] + 1);
            } else {
                list = list.subList(query[i], list.size());
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
