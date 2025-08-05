package src.level0;

/*
level-0
특이한 정렬

입출력 예
numlist	                        n	result
[1, 2, 3, 4, 5, 6]	            4	[4, 5, 3, 6, 2, 1]
[10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]
 */

import java.util.Arrays;

public class P120880 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        System.out.println(Arrays.toString(solution(numlist, n)));
    }

    public static int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }

        return numlist;
    }
}
