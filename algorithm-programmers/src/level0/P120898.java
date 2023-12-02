package src.level0;

/*
level-0
편지

message	            result
"happy birthday!"	30
"I love you~"	    22
 */

public class P120898 {
    public static void main(String[] args) {
        String message = "happy birthday!";

        System.out.println(solution(message));
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
