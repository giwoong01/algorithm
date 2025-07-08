package src.level0;

/*
level-0
무작위로 K개의 수 뽑기

입출력 예
arr	                k	result
[0, 1, 1, 2, 2, 3]	3	[0, 1, 2]
[0, 1, 1, 1, 1]	    4	[0, 1, -1, -1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181858 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1};
        int k = 4;

        System.out.println(Arrays.toString(solution(arr, k)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        for(int i = 0; i < Math.min(list.size(), k); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
