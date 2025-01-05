package src.level0;

/*
level-0
간단한 식 계산하기

입출력 예
binomial	    result
"43 + 12"	    55
"0 - 7777"	    -7777
"40000 * 40000"	1600000000
 */

public class P181865 {
    public static void main(String[] args) {
        String binomial = "43 + 12";

        System.out.println(solution(binomial));
    }

    public static int solution(String binomial) {
        String[] split = binomial.split(" ");

        if (split[1].trim().equals("+")) {
            return Integer.parseInt(split[0].trim()) + Integer.parseInt(split[2].trim());
        } else if (split[1].trim().equals("-")) {
            return Integer.parseInt(split[0].trim()) - Integer.parseInt(split[2].trim());
        } else {
            return Integer.parseInt(split[0].trim()) * Integer.parseInt(split[2].trim());
        }
    }
}
