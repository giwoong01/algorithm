package src.level0;

/*
level-0
배열 만들기 3

입출력 예
arr	            intervals	        result
[1, 2, 3, 4, 5]	[[1, 3], [0, 4]]	[2, 3, 4, 1, 2, 3, 4, 5]
 */

import java.util.ArrayList;
import java.util.List;

public class P181895 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        System.out.println(solution(arr, intervals));
    }

    public static List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                answer.add(arr[j]);
            }
        }

        return answer;
    }
}
