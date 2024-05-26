package src.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
level-0
n개 간격의 원소들

입출력 예
num_list	        n	result
[4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
[4, 2, 6, 1, 7, 6]	4	[4, 7]
 */

public class P181888 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;

        System.out.println(Arrays.toString(solution(num_list, n)));
    }

    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(num_list[0]);

        for (int i = 1; i < num_list.length; i++) {
            if (i % n == 0) {
                answer.add(num_list[i]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
