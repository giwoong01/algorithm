package src.level0;

/*
level-0
배열 비교하기

입출력 예
arr1	            arr2	            result
[49, 13]	        [70, 11, 2]	        -1
[100, 17, 84, 1]	[55, 12, 65, 36]	1
[1, 2, 3, 4, 5] 	[3, 3, 3, 3, 3]	    0
 */

public class P181856 {
    public static void main(String[] args) {
        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        System.out.println(solution(arr1, arr2));
    }

    public static int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int j : arr1) {
            sum1 += j;
        }

        for (int j : arr2) {
            sum2 += j;
        }

        return Integer.compare(sum1, sum2);
    }
}
