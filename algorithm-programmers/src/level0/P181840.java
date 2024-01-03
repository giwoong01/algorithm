package src.level0;

/*
level-0
정수 찾기

입출력 예
num_list	        n	result
[1, 2, 3, 4, 5]	    3	1
[15, 98, 23, 2, 15]	20	0
 */

public class P181840 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        int n = 3;

        System.out.println(solution(num_list, n));
    }

    public static int solution(int[] num_list, int n) {
        for (int i : num_list) {
            if (i == n) {
                return 1;
            }
        }

        return 0;
    }
}
