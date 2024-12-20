package src.level0;

/*
level-0
배열의 원소 삭제하기

입출력 예
arr	                            delete_list	            result
[293, 1000, 395, 678, 94]	[94, 777, 104, 1000, 1, 12]	[293, 395, 678]
[110, 66, 439, 785, 1]	    [377, 823, 119, 43]	        [110, 66, 439, 785, 1]
 */

import java.util.ArrayList;
import java.util.List;

public class P181844 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        System.out.println(solution(arr, delete_list));
    }

    public static List<Integer> solution(int[] num_list, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for (int i : num_list) {
            answer.add(i);
        }

        for (int i : delete_list) {
            int index = answer.indexOf(i);

            if (index != -1) {
                answer.remove(index);
            }
        }

        return answer;
    }
}
