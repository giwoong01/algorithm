package src.level0;

/*
level-0
두 수의 합

입출력 예
a	                    b	                    result
"582"	                "734"	                "1316"
"18446744073709551615"	"287346502836570928366"	"305793246910280479981"
"0"	                    "0"	                    "0"
 */

import java.math.BigInteger;

public class P181846 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        System.out.println(solution(a, b));
    }

    public static String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}
