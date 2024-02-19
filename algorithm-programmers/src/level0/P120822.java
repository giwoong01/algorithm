package src.level0;

/*
level-0
문자열 뒤집기

 */

public class P120822 {
    public static void main(String[] args) {
        String my_string = "jaron";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }
}
