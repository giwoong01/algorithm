package src.level0;

/*
level-0
문자열 정렬하기 (1)

입출력 예
my_string	result
"hi12392"	[1, 2, 2, 3, 9]
"p2o4i8gj2"	[2, 2, 4, 8]
"abcde0"	[0]
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P120850 {
    public static void main(String[] args) {
        String my_string = "hi12392";

        System.out.println(solution(my_string));
    }

    public static List<Integer> solution(String my_string) {
        List<Integer> integers = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                integers.add((int) c - '0');
            }
        }
        Collections.sort(integers);

        return integers;
    }
}
