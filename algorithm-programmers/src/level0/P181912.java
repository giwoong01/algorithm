package src.level0;

/*
level-0
배열 만들기 5

입출력 예
intStrs	                                    k	    s	l	result
["0123456789","9876543210","9999999999999"]	50000	5   5	[56789, 99999]
 */

import java.util.ArrayList;
import java.util.List;

public class P181912 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        System.out.println(solution(intStrs, k, s, l));
    }

    public static List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            String substring = intStr.substring(s, s + l);

            if (Integer.parseInt(substring) > k) {
                answer.add(Integer.parseInt(substring));
            }
        }

        return answer;
    }
}
