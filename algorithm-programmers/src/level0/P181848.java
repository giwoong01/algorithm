package src.level0;

/*
level-0
문자열을 정수로 변환하기

입출력 예
n_str	result
"10"	10
"8542"	8542
 */

import java.util.Arrays;

public class P181848 {
    public static void main(String[] args) {
        String n_str = "10";

        System.out.println(solution(n_str));
    }

    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}
