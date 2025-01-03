package src.level0;

/*
level-0
인덱스 바꾸기

입출력 예
my_string	    num1	num2	result
"hello"	        1	    2	    "hlelo"
"I love you"	3	    6	    "I l veoyou"
 */

public class P120895 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        System.out.println(solution(my_string, num1, num2));
    }

    public static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);

        sb.setCharAt(num1, my_string.charAt(num2));
        sb.setCharAt(num2, my_string.charAt(num1));

        return sb.toString();
    }
}
