package src.level0;

/*
level-0
뒤에서 5등 위로

입출력 예
num_list	                            result
[12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
 */

import java.util.Arrays;

public class P181852 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        System.arraycopy(num_list, 5, answer, 0, num_list.length - 5);

        return answer;
    }
}
