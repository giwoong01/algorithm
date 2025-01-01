package src.level0;

/*
level-0
가까운 1 찾기

입출력 예
arr	                idx	result
[0, 0, 0, 1]	    1	3
[1, 0, 0, 1, 0, 0]	4	-1
[1, 1, 1, 1, 0]	    3	3
 */

public class P181898 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        int idx = 1;

        System.out.println(solution(arr, idx));
    }

    public static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }

}
