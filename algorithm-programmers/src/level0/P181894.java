package src.level0;

/*
level-0
2의 영역

입출력 예
arr	                        result
[1, 2, 1, 4, 5, 2, 9]	    [2, 1, 4, 5, 2]
[1, 2, 1]	                [2]
[1, 1, 1]	                [-1]
[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
 */

import java.util.ArrayList;
import java.util.List;

public class P181894 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};

        System.out.println(solution(arr));
    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
              list.add(i);
            }
        }

        if (list.isEmpty()) {
            return List.of(-1);
        }

        for (int i = list.get(0); i <= list.get(list.size() - 1); i++) {
            answer.add(arr[i]);
        }

        return answer;
    }
}
