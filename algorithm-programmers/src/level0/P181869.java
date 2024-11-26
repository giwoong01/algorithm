package src.level0;

/*
level-0
공백으로 구분하기 1

입출력 예
my_string	    result
"i love you"	["i", "love", "you"]
"programmers"	["programmers"]
 */

import java.util.Arrays;

public class P181869 {
    public static void main(String[] args) {
        String my_string = "i love you";

        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

}
