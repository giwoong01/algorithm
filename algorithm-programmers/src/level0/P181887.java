package src.level0;

/*
level-0
홀수 vs 짝수

입출력 예
num_list	        result
[4, 2, 6, 1, 7, 6]	17
[-1, 2, 5, 6, 3]	8
 */

public class P181887 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Math.max(even, odd);
    }
}
