package src.level2;

/*
level-2
가장 큰 수

입출력 예
numbers	            return
[6, 10, 2]	        "6210"
[3, 30, 34, 5, 9]	"9534330"
 */

import java.util.Arrays;

public class P42746 {
    public static void main(String[] args) {
        int[] numbers = {0,0,0};

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] numString = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numString, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(numString[0].equals("0")) {
            return "0";
        }

        for (String s : numString) {
            sb.append(s);
        }

        return String.valueOf(sb);
    }
}
