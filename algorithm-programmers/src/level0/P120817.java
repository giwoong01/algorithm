package src.level0;

/*
level-0
배열의 평균 값

numbers                                 	    result
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]             	5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
 */

import java.util.Arrays;

public class P120817 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(solution(numbers));
    }

    public static double solution(int[] numbers) {
        return (double) Arrays.stream(numbers).sum() / numbers.length;
    }
}
