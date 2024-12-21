package src.level0;

/*
level-0
배열의 원소만큼 추가하기

입출력 예
arr	        result
[5, 1, 4]	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
[6, 6]	    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
[1]	        [1]
 */

import java.util.ArrayList;
import java.util.List;

public class P181861 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4};

        System.out.println(solution(arr));
    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int k : arr) {
            for (int j = 0; j < k; j++) {
                answer.add(k);
            }
        }

        return answer;
    }
}
