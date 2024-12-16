package src.level0;

/*
level-0
순서 바꾸기

입출력 예
num_list	    n	result
[2, 1, 6]	    1	[1, 6, 2]
[5, 2, 1, 7, 5]	3	[7, 5, 5, 2, 1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181891 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        List<Integer> a = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            a.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            a.add(num_list[i]);
        }

        int[] answer = new int[num_list.length];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }

        return answer;
    }
}
