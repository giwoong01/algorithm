package src.level0;

/*
level-0
배열 원소의 길이

strlist	                        result
["We", "are", "the", "world!"]	[2, 3, 3, 6]
["I", "Love", "Programmers."]	[1, 4, 12]
 */

import java.util.Arrays;

public class P120854 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(solution(strlist)));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}
