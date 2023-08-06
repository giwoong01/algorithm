package src.level0;

/*
level-0
문자열 곱하기

입출력 예
my_string	k	result
"string"	3	"stringstringstring"
"love"	    10	"lovelovelovelovelovelovelovelovelovelove"
 */

public class P181940 {
    public String solution(String my_string, int k) {
        return String.valueOf(my_string).repeat(Math.max(0, k));
    }
}
