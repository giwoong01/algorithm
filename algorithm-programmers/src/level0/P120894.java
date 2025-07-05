package src.level0;

/*
level-0
영어가 싫어요

입출력 예
numbers	                                result
"onetwothreefourfivesixseveneightnine"	123456789
"onefourzerosixseven"	                14067
 */

public class P120894 {
    public static void main(String[] args) {
        String numbers = "onefourzerosixseven";

        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            numbers = numbers.replace(s, String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
