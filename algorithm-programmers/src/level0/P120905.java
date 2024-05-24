package src.level0;

/*
level-0
n의 배수 고르기

입출력 예
n	numlist                     	result
3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
5	[1, 9, 3, 10, 13, 5]	        [10, 5]
12	[2, 100, 120, 600, 12, 12]	    [120, 600, 12, 12]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120905 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(Arrays.toString(solution(n, numlist)));
    }

    public static int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int j : numlist) {
            if (j % n == 0) {
                answer.add(j);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
