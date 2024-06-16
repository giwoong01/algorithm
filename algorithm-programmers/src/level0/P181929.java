package src.level0;

/*
level-0
원소들의 곱과 합

입출력 예
num_list	    result
[3, 4, 5, 2, 1]	1
[5, 7, 8, 3]	0
 */

public class P181929 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;

        for (int j : num_list) {
            mul *= j;
            sum += j;
        }

        return mul > sum * sum ? 0 : 1;
    }
}
