package src.level0;

/*
level-0
배열 만들기 2

입출력 예
l	r	result
5	555	[5, 50, 55, 500, 505, 550, 555]
10	20	[-1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181921 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;

        System.out.println(Arrays.toString(solution(l, r)));
    }

    public static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
