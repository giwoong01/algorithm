package src.level0;

/*
level-0
배열 만들기 4

입출력 예
arr	            result
[1, 4, 2, 5, 3]	[1, 2, 3]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181918 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else {
                list.remove(list.size() - 1);
                i--;
            }
        }

        int[] stk = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }

        return stk;
    }
}
