package src.level0;

/*
level-0
배열 만들기 6

입출력 예
arr	            result
[0, 1, 1, 1, 0]	[0, 1, 0]
[0, 1, 0, 1, 0]	[0, 1, 0, 1, 0]
[0, 1, 1, 0]	[-1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181859 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i]);
                i++;
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }

}
